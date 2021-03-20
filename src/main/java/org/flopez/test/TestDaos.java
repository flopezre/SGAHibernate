package org.flopez.test;

import java.util.List;
import org.flopez.dao.AlumnoDao;
import org.flopez.dao.AsignacionDao;
import org.flopez.dao.ContactoDao;
import org.flopez.dao.CursoDao;
import org.flopez.dao.DomicilioDao;


/**
 *
 * @author Fabian Lopez Reyes
 */
public class TestDaos {
    
    public static void main(String[] args) {
        
        AlumnoDao alumnoDao = new AlumnoDao();
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
        
        System.out.println("Domicilio: ");
        DomicilioDao domicilioDao = new DomicilioDao();
        imprimir(domicilioDao.listar());
        
        System.out.println("Contacto: ");
        ContactoDao contactoDao = new ContactoDao();
        imprimir(contactoDao.listar());
        
        System.out.println("Curso: ");
        CursoDao cursoDao = new CursoDao();
        imprimir(cursoDao.listar());
        
        System.out.println("Asignaciones: ");
        AsignacionDao asignacionDao = new AsignacionDao();
        imprimir(asignacionDao.listar());
        
    }
    
    private static void imprimir(List coleccion) {
        for(Object o: coleccion) {
            System.out.println("valor = " + o);
        }
    }
}
