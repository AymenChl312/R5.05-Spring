package fr.aymen.tp_spring.Article.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String contenu;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Publication() {}

    public Publication(String titre, String contenu, User user) {
        this.titre = titre;
        this.contenu = contenu;
        this.user = user;
    }

    public Long getId() { return id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getContenu() { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
