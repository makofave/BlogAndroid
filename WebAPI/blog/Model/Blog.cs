using System.ComponentModel.DataAnnotations;

public class Blog
{
    [Key]
    public int Id { get; set; }

    [Required]
    public required string Titulo { get; set; }

    [Required]
    public required string Autor { get; set; }
    
    [Required]
    public required string Contenido { get; set; }

    [Required]
    public required string Fecha { get; set; }
}