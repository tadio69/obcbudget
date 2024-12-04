
package couche_dao;

import couche_jpa.Examen;
import java.util.List;


public interface IExamen {
    //créer un nouvel examen
    public Examen create(Examen examen);
    // modifier un examen existant
    public Examen edit(Examen examen);
    // supprimer un examen existant
    public void destroy(Examen examen);
    // chercher un examen particulier
    public Examen find(int id);
    // obtenir tous les objets Examen
    public List<Examen> findAll();
    // obtenir tous les objets Examen de nom like nom
    public List<Examen> findAllLikeName(String nom);

    public Examen findExamenBySigle(String sigle);

    public List<Examen> findExamensD1NiveauEtD1Type(String niveau, String type);

    public List<Examen> findExamensD1Type(String type);

    public List<Examen> findExamensD1Niveau(String niveau);

    public List<Examen> findExamensIndustiels();

    public List<Examen> findExamensStt();

    public List<Examen> findExamensEstp();

    public List<Examen> findExamensIndustielsD1Niveau(String niveau);

    public List<Examen> findExamensSttD1Niveau(String niveau);

    public List<Examen> findExamensEstpD1Niveau(String niveau);
}
