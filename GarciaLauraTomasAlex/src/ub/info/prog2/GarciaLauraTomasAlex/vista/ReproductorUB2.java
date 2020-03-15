
package ub.info.prog2.GarciaLauraTomasAlex.vista;

import ub.info.prog2.utils.Menu;
import java.util.Scanner;
import ub.info.prog2.GarciaLauraTomasAlex.Model.LlistaFitxers;
import ub.info.prog2.GarciaLauraTomasAlex.Model.FitxerMultimedia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import ub.info.prog2.utils.ReproException;
        
public class ReproductorUB2 {
    static private enum OpcionsMenu {GESTIO_FITXER,GUARDA_DADES,RECUPERA_DADES,SORTIR};
    
    static final private String[] MENU={"GESTIO FITXERS",
                                        "GUARDA DADES",
                                        "RECUPERA DADES",
                                        "SORTIR"};

    public void gestioReproductorUB(){
        Scanner sc = new Scanner(System.in);
        int comp = 0;
        File fitxer = new File("fitxer.dat");
        LlistaFitxers llista = new LlistaFitxers();
        
        Menu<OpcionsMenu> elMenu = new Menu("Menu",OpcionsMenu.values());
        elMenu.setDescripcions(MENU);
        
        OpcionsMenu opcio;
        do {
            elMenu.mostrarMenu();

            // Demanem una opcio
            opcio = elMenu.getOpcio(sc);
            
            switch(opcio) {
                case GESTIO_FITXER:
                    /*try{
                        if (llista.isFull()){
                            System.out.println("La llista està plena no es poden afegir més fitxers");
                            break;
                        }
                        FitxerMultimedia file;
                        System.out.println("Dona'm l'adreça del fitxer:");
                        String cami = sc.nextLine();
                        System.out.println("I l'autor:");
                        String autor = sc.nextLine();
                        String buit = "";
                        if(autor.equalsIgnoreCase(buit))
                            file = new FitxerMultimedia(cami);
                        else
                            file = new FitxerMultimedia(cami, autor);


                        llista.addFitxer(file);
                        comp++;
                    }
                    catch(ReproException repExc){
                        break;
                    }
                    */
                    break;
                    
                case GUARDA_DADES:
                   /* System.out.println("Dona'm la posició del fitxer:");
                    int i = sc.nextInt();
                    if((i) > comp){
                        System.out.println("Aquí no hi ha fitxer");
                        break;
                    }
                    
                    llista.removeFitxer(llista.getAt(i-1));
                    comp--;
                    
                    
                    break;
                    
                case RECUPERA_DADES:
                    System.out.print("Carpeta fitxers:\n=================\n ");
                    for(int j = 0; j < comp; j++){
                        System.out.println("["+(j+1)+"]"+llista.getAt(j).toString());
                    }*/
                    
                    break;
                
                /*case GUARDAR_LLISTA:
                    String s = "";

                    try (FileOutputStream fop = new FileOutputStream(fitxer)) {

                            // if file doesn't exists, then create it
                            if (!fitxer.exists()) {
                                    fitxer.createNewFile();
                            }
                            for(int j = 0; j < comp; j++){
                                s = s + ("\n["+(j+1)+"]"+llista.getAt(j).toString());
                            }
                            // get the content in bytes
                            byte[] sByte = s.getBytes();

                            fop.write(sByte);
                            fop.flush();
                            fop.close();

                            System.out.println("Done");

                    } catch (IOException e) {
                            e.printStackTrace();
                    }
                    
                    break;
                    
                case RECUPERAR_LLISTA:
                    FileInputStream fin = null;
                    try {
                        fin = new FileInputStream(fitxer);
                        // if file doesn't exists, then create it
                        if (!fitxer.exists()) {
                                fitxer.createNewFile();
                        }
                        int contingut;
                        while ((contingut = fin.read()) != -1) {
                            // convert to char and display it
                            System.out.print((char) contingut);
                        }                          
                    } catch (IOException e) {
                            e.printStackTrace();
                    }finally {
			try {
                            if (fin != null){
                                fin.close();
                            }
			}catch (IOException ex) {
                            ex.printStackTrace();
			}
                    }
                    System.out.println();
                    break;*/
                    
                case SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while(opcio!=OpcionsMenu.SORTIR);
    }
    static private enum OpMenuGestio {CREAR_PORTAFOLI,MOSTRAR_PORTAFOLI,ELIMINAR_PORTAFOLI,AFEGIR_FITXER_MULTIMEDIA,MOSTRAR_FITXER,
                                        ELIMINAR_FITXER_MULTIMEDIA,TORNA_MENU_ANTERIOR};
    
    static final private String[] MENUGESTIO={"CREAR PORTAFOLI",
                                                "MOSTRAR PORTAFOLI",
                                                "ELIMINAR PORTAFOLI",
                                                "AFEGIR FITXER MULTIMEDIA",
                                                "MOSTRAR FITXER",
                                                "ELIMINAR FITXER MULTIMEDIA",
                                                "TORNA AL MENU ANTERIOR"};
    public void menuGestio(){
        Scanner sc = new Scanner(System.in);
        int comp = 0;
        File fitxer = new File("fitxer.dat");
        LlistaFitxers llista = new LlistaFitxers();
        
        Menu<OpMenuGestio> elMenu = new Menu("Menu",OpcionsMenu.values());
        elMenu.setDescripcions(MENUGESTIO);
        
        OpMenuGestio opcio;
        elMenu.mostrarMenu();
        
        opcio = elMenu.getOpcio(sc);
        
        switch(opcio) {
            case CREAR_PORTAFOLI:
                break;
                
            case MOSTRAR_PORTAFOLI:
                break;
                
            case ELIMINAR_PORTAFOLI:
                break;
                
            case AFEGIR_FITXER_MULTIMEDIA:
                break;
                
            case MOSTRAR_FITXER:
                break;
                
            case ELIMINAR_FITXER_MULTIMEDIA:
                break;
                
            case TORNA_MENU_ANTERIOR:
                gestioReproductorUB();
                break;
            
        }
    }
    
    
    static private enum OpMenuFitxer {AFEGIR_AUDIO,AFEGIR_IMATGE,TORNA_MENU_ANTERIOR};
    
    static final private String[] MENUFITXER={"AFEGIR AUDIO",
                                                "AFEGIR IMATGE",
                                                "TORNA AL MENU ANTERIOR"};
    public void menuGestioFitxer(){
        Scanner sc = new Scanner(System.in);
        int comp = 0;
        
        int repPort;
        
        Menu<OpMenuFitxer> elMenu = new Menu("Menu",OpcionsMenu.values());
        elMenu.setDescripcions(MENUFITXER);
        
        OpMenuFitxer opcio;
        elMenu.mostrarMenu();
        
        System.out.println("Vols guardar al repositori(1) o a un portafoli(2)?");
        repPort = sc.nextInt();
        /*
        if(repPor == 1){
            guarda repositori
        }else{
            mostra llista portafolis
        }
        */
        
        opcio = elMenu.getOpcio(sc);
        
        switch(opcio) {
            case AFEGIR_AUDIO:
                break;
                
            case AFEGIR_IMATGE:
                break;
                
            case TORNA_MENU_ANTERIOR:
                gestioReproductorUB();
                break;
            
        }
    }
}
