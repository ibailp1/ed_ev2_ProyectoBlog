package org.cuatrovientos.ed;

public class Post {

    private int id;
    private String title;
    private String content;
    

    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public void showPost() {
        System.out.println("id: " + id);
        System.out.println("Título: " + title);
        System.out.println("Contenido: " + content);
    }

    public String toString() {
        return "id: " + id + " | Título: " + title + " | Contenido: " + content;
    }
}
