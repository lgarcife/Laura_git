
package ub.info.prog2.GarciaLauraTomasAlex.Model;

/**
 *
 * @author lgarcife76.alumnes
 */
import java.util.Date;
import ub.info.prog2.utils.InFile;
import java.io.File;

public class FitxerMultimedia extends File implements InFile {
    
    String autor;

    public FitxerMultimedia(String cami) {
        super(cami);
        this.autor = "desconegut";
    }

    public FitxerMultimedia(String cami, String nom) {
        super(cami);
        this.autor = nom;
    }

    @Override
    public Date getUltimaModificacio() {
        long data = super.lastModified();
        Date d = new Date(data);
        return d;
    }

    @Override
        public String getCamiAbsolut() {
            return super.getAbsolutePath();
    }

    @Override
    public String getNomFitxer() {
        return super.getName();
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String string) {
        autor = string;
    }
    
    @Override
    public String toString() {
        String s;
        s = "Autor: " + this.getAutor() + "\n   Nom Fitxer: " + this.getNomFitxer()
                + "\n   Data Ultima Modificacio: " + this.getUltimaModificacio() + "\n   Cami: " + this.getCamiAbsolut();
        return s;
    }
    
    public boolean equals(FitxerMultimedia fitxerMultimedia) {
        if (this.getAutor().equals(fitxerMultimedia.getAutor())) {
            if (this.getCamiAbsolut().equals(fitxerMultimedia.getCamiAbsolut())) {
                if (this.getUltimaModificacio().equals(fitxerMultimedia.getUltimaModificacio())) {
                    if (this.getNomFitxer().equals(fitxerMultimedia.getNomFitxer())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
