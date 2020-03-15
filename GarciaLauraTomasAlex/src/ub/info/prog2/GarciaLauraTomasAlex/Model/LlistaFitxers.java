
package ub.info.prog2.GarciaLauraTomasAlex.Model;
import java.io.File;
import ub.info.prog2.utils.InFileList;
import java.util.ArrayList;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author laura
 */
public class LlistaFitxers implements InFileList {
    int sizeMax;
    
    ArrayList<File> llista = new ArrayList(sizeMax); 
    
    public LlistaFitxers(int sizeMax){
        this.sizeMax = sizeMax;
    }
    public LlistaFitxers(){
        this.sizeMax = 100;
    }
    @Override
    public int getSize(){
        return sizeMax;
    }


    @Override
    public void addFitxer(File file) throws ReproException{
        if(file.exists()){
            llista.add(file);

        }else{
            ReproException except = new ReproException("Aquest fitxer no existeix");
            throw except;
        }
        
            
        
    }
@Override
    public void removeFitxer(File file){
        llista.remove(file);
    }
@Override
    public File getAt(int i){
        return llista.get(i);
    }
@Override
    public void clear(){
        llista.clear();
        
    }
@Override
    public boolean isFull(){
        if(llista.size() == sizeMax)
            return true;
        
        return false;
    }
    
}
