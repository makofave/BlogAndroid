package com.blog.app.data.model

import javax.inject.Inject
import javax.inject.Singleton


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
            titulo = "Diferencia de Lenguaje",
            autor = "Roberto A.",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."
        ),
        BlogModel(
            titulo = "Kotlin",
            autor = "Mariana M.",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris" +
                    "volutpat, dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purusn" +
                    "dui nec risus. Maecenas non sodales nisi, vel dictum dolor. Class aptent taciti sociosqu ad" +
                    "litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse blandit eleifend" +
                    "diam, vel rutrum tellus vulputate quis. Aliquam eget libero aliquet, imperdiet nisl a," +
                    "ornare ex. Sed rhoncus est ut libero porta lobortis. Fusce in dictum tellus." +
                    "Suspendisse interdum ornare ante. Aliquam nec cursus lorem. Morbi id magna felis. Vivamus" +
                    "egestas, est a condimentum egestas, turpis nisl iaculis ipsum, in dictum tellus dolor sed" +
                    "neque. Morbi tellus erat, dapibus ut sem a, iaculis tincidunt dui. Interdum et malesuada" +
                    "fames ac ante ipsum primis in faucibus. Curabitur et eros porttitor, ultricies urna vitae," +
                    "molestie nibh. Phasellus at commodo eros, non aliquet metus. Sed maximus nisl nec dolor" +
                    "bibendum, vel congue leo egestas." +
                    "Sed interdum tortor nibh, in sagittis risus mollis quis. Curabitur mi odio, condimentum sit" +
                    "amet auctor at, mollis non turpis. Nullam pretium libero vestibulum, finibus orci vel," +
                    "molestie quam. Fusce blandit tincidunt nulla, quis sollicitudin libero facilisis et. Integer"+
                    "interdum nunc ligula, et fermentum metus hendrerit id. Vestibulum lectus felis, dictum at" +
                    "lacinia sit amet, tristique id quam. Cras eu consequat dui. Suspendisse sodales nunc ligula," +
                    "in lobortis sem porta sed. Integer id ultrices magna, in luctus elit. Sed a pellentesque" +
                    "est." +
                    "Aenean nunc velit, lacinia sed dolor sed, ultrices viverra nulla. Etiam a venenatis nibh." +
                    "Morbi laoreet, tortor sed facilisis varius, nibh orci rhoncus nulla, id elementum leo du" +
                    "non lorem. Nam mollis ipsum quis auctor varius. Quisque elementum eu libero sed commodo. I" +
                    "eros nisl, imperdiet vel imperdiet et, scelerisque a mauris. Pellentesque varius ex nunc" +
                    "quis imperdiet eros placerat ac. Duis finibus orci et est auctor tincidunt. Sed non viverr" +
                    "ipsum. Nunc quis augue egestas, cursus lorem at, molestie sem. Morbi a consectetur ipsum, " +
                    "placerat diam. Etiam vulputate dignissim convallis. Integer faucibus mauris sit amet finibu" +
                    "convallis." +
                    "Phasellus in aliquet mi. Pellentesque habitant morbi tristique senectus et netus e" +
                    "malesuada fames ac turpis egestas. In volutpat arcu ut felis sagittis, in finibus mass" +
                    "gravida. Pellentesque id tellus orci. Integer dictum, lorem sed efficitur ullamcorper" +
                    "libero justo consectetur ipsum, in mollis nisl ex sed nisl. Donec maximus ullamcorpe" +
                    "sodales. Praesent bibendum rhoncus tellus nec feugiat. In a ornare nulla. Donec rhoncu" +
                    "libero vel nunc consequat, quis tincidunt nisl eleifend. Cras bibendum enim a justo luctus" +
                    "vestibulum. Fusce dictum libero quis erat maximus, vitae volutpat diam dignissim."
        ),
        BlogModel(
            titulo = "JAVA",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."+
            "Aenean nunc velit, lacinia sed dolor sed, ultrices viverra nulla. Etiam a venenatis nibh." +
                    "Morbi laoreet, tortor sed facilisis varius, nibh orci rhoncus nulla, id elementum leo du" +
                    "non lorem. Nam mollis ipsum quis auctor varius. Quisque elementum eu libero sed commodo. I" +
                    "eros nisl, imperdiet vel imperdiet et, scelerisque a mauris. Pellentesque varius ex nunc" +
                    "quis imperdiet eros placerat ac. Duis finibus orci et est auctor tincidunt. Sed non viverr" +
                    "ipsum. Nunc quis augue egestas, cursus lorem at, molestie sem. Morbi a consectetur ipsum, " +
                    "placerat diam. Etiam vulputate dignissim convallis. Integer faucibus mauris sit amet finibu" +
                    "convallis." +
                    "Phasellus in aliquet mi. Pellentesque habitant morbi tristique senectus et netus e" +
                    "malesuada fames ac turpis egestas. In volutpat arcu ut felis sagittis, in finibus mass" +
                    "gravida. Pellentesque id tellus orci. Integer dictum, lorem sed efficitur ullamcorper" +
                    "libero justo consectetur ipsum, in mollis nisl ex sed nisl. Donec maximus ullamcorpe" +
                    "sodales. Praesent bibendum rhoncus tellus nec feugiat. In a ornare nulla. Donec rhoncu" +
                    "libero vel nunc consequat, quis tincidunt nisl eleifend. Cras bibendum enim a justo luctus" +
                    "vestibulum. Fusce dictum libero quis erat maximus, vitae volutpat diam dignissim."
        ),
        BlogModel(
            titulo = "Android Studio",
            autor = "Alberto ELias",
            fecha = "20/12/2023 8:00 A.M.",
            contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."+
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris volutpat, " +
                    "dolor id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus  dui nec risus. " +
                    "Maecenas non sodales nisi, vel dictum dolor."+
                    "Aenean nunc velit, lacinia sed dolor sed, ultrices viverra nulla. Etiam a venenatis nibh." +
                    "Morbi laoreet, tortor sed facilisis varius, nibh orci rhoncus nulla, id elementum leo du" +
                    "non lorem. Nam mollis ipsum quis auctor varius. Quisque elementum eu libero sed commodo. I" +
                    "eros nisl, imperdiet vel imperdiet et, scelerisque a mauris. Pellentesque varius ex nunc" +
                    "quis imperdiet eros placerat ac. Duis finibus orci et est auctor tincidunt. Sed non viverr" +
                    "ipsum. Nunc quis augue egestas, cursus lorem at, molestie sem. Morbi a consectetur ipsum, " +
                    "placerat diam. Etiam vulputate dignissim convallis. Integer faucibus mauris sit amet finibu" +
                    "convallis." +
                    "Phasellus in aliquet mi. Pellentesque habitant morbi tristique senectus et netus e" +
                    "malesuada fames ac turpis egestas. In volutpat arcu ut felis sagittis, in finibus mass" +
                    "gravida. Pellentesque id tellus orci. Integer dictum, lorem sed efficitur ullamcorper" +
                    "libero justo consectetur ipsum, in mollis nisl ex sed nisl. Donec maximus ullamcorpe" +
                    "sodales. Praesent bibendum rhoncus tellus nec feugiat. In a ornare nulla. Donec rhoncu" +
                    "libero vel nunc consequat, quis tincidunt nisl eleifend. Cras bibendum enim a justo luctus" +
                    "vestibulum. Fusce dictum libero quis erat maximus, vitae volutpat diam dignissim."
        )
    )
}