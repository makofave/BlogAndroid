using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

var connectionString=builder.Configuration.GetConnectionString("Default");

builder.Services.AddDbContext<AppDbContext>(
    options=>
    options.UseSqlite(connectionString)
);


// Add services to the container.
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();


app.MapGet("/Blogs",async(AppDbContext context)=>await context.Blog.ToListAsync());

app.MapGet("/Count",async(AppDbContext context)=>{
    
    var list=await context.Blog.ToListAsync();
    return list.Count;
    
    });


async Task<List<Blog>> GetBlogs(AppDbContext context) => await context.Blog.ToListAsync();

app.MapPost("/Blog",async (AppDbContext context,Blog blog)=>{
 
    blog.Fecha=DateTime.Now.ToString();
    context.Blog.Add(blog);
    await context.SaveChangesAsync();
    return Results.Ok(blog);


});
app.Run();





