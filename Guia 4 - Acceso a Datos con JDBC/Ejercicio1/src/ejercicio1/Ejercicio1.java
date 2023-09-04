/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author calga
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=Conexion.getConexion();
        try {
            
//            Punto C - Insertar 3 alumnos 
            
            String c = "INSERT INTO alumno (idalumno,dni,apellido,nombre,fechanacimiento,estado)"
                    + " VALUES (null,34879512,'Sanchez','Emanuel','1990-12-25','1'),(null,42987123,'Lopez','Claudio','1998-02-17','1'),(null,29789987,'Marwe','Lorena','1992-05-27','1')";
            PreparedStatement addAlumnos = con.prepareStatement(c);
            int FilasAfectadas= addAlumnos.executeUpdate();
            System.out.println("Cantidad de alumnos agregados: " + FilasAfectadas);

 
//            Punto D - Insertar 4 materias
            
/*            String d = "INSERT INTO materia (idmateria,nombre,año,estado)"
                    + " VALUES (null,'Lengua','1','1'),(null,'Matematica','3','1'),(null,'Sociales','3',1),(null,'Edu Fisica','5','1')";
            PreparedStatement addMaterias = con.prepareStatement(d);
            int FilasAfectadas2= addMaterias.executeUpdate();
            System.out.println("Cantidad de alumnos agregados: " + FilasAfectadas2);
 */

//            Punto E - Inscribir a los 3 alumnos en 2 materias cada uno
            
 /*           if (FilasAfectadas >0 && FilasAfectadas>0) {
            String e = "INSERT INTO inscripcion (idinscripto,nota,idAlumno,idMateria)"
                    + " VALUES (null,6,4,1),(null,10,4,4),(null,8,5,3),(null,9,5,1),(null,9,6,4),(null,6,6,2)";
            PreparedStatement addInscripcion = con.prepareStatement(e);
            int FilasAfectadas3= addInscripcion.executeUpdate();
            System.out.println("Cantidad de alumnos agregados: " + FilasAfectadas3);
  */        // }


//            Punto F - Listar los datos de los alumnos con calificaciones superiores a 8
            
/*            String f = "SELECT * FROM alumno JOIN inscripcion ON (alumno.idAlumno = inscripcion.idAlumno) WHERE nota > 8";
            PreparedStatement listarAlumnos = con.prepareStatement(f);
            ResultSet listado= listarAlumnos.executeQuery();
            while(listado.next()){
                System.out.println("Nombre: "+ listado.getString("nombre"));
                System.out.println("Apellido: "+ listado.getString("apellido"));
                System.out.println("Nota: "+ listado.getInt("dni"));
                System.out.println("------------------------------------------");
            }
*/
  
//            Punto G - Desinscribir un alumno de una de las materias.
            
/*            String g = "Delete FROM inscripcion WHERE idInscripto = 3";
            PreparedStatement desinscribir = con.prepareStatement(g);
            int FilasAfectadas4 = desinscribir.executeUpdate();
            System.out.println("Cantidad de alumnos agregados: " + FilasAfectadas4);
*/            
            
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Coneccion erronea");
        } 
        
       }

}
