package com.ucreativa.vacunacion.repositories;

import com.sun.source.tree.WhileLoopTree;
import com.ucreativa.vacunacion.entities.Persona;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{
    private File file;
    private FileWriter fileWriter;

    public FileRepository(){
        this.file = new File ("BaseDeDatos.txt");
        if (!this.file.exists()) {
            this.file.createNewFile();
        }
    }

    @Override
    public void save(Persona persona, String marca, Date fecha) {
        SimpleDateFormat format  = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String escribir = persona.getNombre()
                + " - " + marca
                + " - " + format.format(fecha);
        FileWriter fileWriter = new FileWriter(this.file.getAbsoluteFile());
        fileWriter.write(escribir);
        fileWriter.close();
    }

    @Override
    public List<String> get() {
        /*
        FileReader fileReader = new FileReader(this.file);
        List<String> listaLeida = new ArrayList<>();
        while (fileReader.read()){
            listaLeida.add(fileReader.read());
        }
        */
        return null;
    }
}
