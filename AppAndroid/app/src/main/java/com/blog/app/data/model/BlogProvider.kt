package com.blog.app.data.model

import javax.inject.Inject

class BlogProvider @Inject constructor(){

    var blogs = mutableListOf<BlogModel>(

        BlogModel(
            titulo = "Como crear un blog",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."
        ),
        BlogModel(
            titulo = "Como crear un blog",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."
        ),
        BlogModel(
            titulo = "Como crear un blog",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."
        ),
        BlogModel(
            titulo = "Como crear un blog",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."
        ),
        BlogModel(
            titulo = "Como crear un blog",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."
        )
    )
}