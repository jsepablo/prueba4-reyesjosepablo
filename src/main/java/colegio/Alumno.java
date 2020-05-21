package colegio;

import java.util.Date;

/**
 * Clase Alumno 
 * @author usuario
 *
 */
public abstract class Alumno implements Escolarizable {
    
    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private int[] notas;
    private static int numAlumnos = 0;
    protected Curso curso;
    
    /**
     * Contructor por defecto
     */
    public Alumno () { numAlumnos++; }
    
    /**
     * Constructor con parámetros nombre, apellidos
     */
    public Alumno (String nombre, String apellidos) {
        this();
        this.nombre    = nombre;
        this.apellidos = apellidos;
    }
    
    /**
     * Constructor con parámetros nombre, apellidos, nacimiento, notas
     */
    public Alumno (String nombre, String apellidos, Date nacimiento, int[] notas) {
        this (nombre, apellidos);
        this.nacimiento = nacimiento;
        this.notas = notas;
    }
     
    /**
     * método get Nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * método set Nombre
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * método get Apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * método set Apellidos
     * @param apellidos apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * método get Nacimiento
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     * método set  Nacimiento
     * @param nacimiento nacimiento
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    /**
     * método get Notas_str
     */
    public String getNotas_str() {
        StringBuffer str = new StringBuffer();
        str = str.append(notas[0]).append(" ").append(notas[1]).append(" ").append(notas[2]);
        return str.toString();
    }

    /**
     * método get Notas
     */
    public int[] getNotas() {
        return notas;
    }

    /**
     * método set  Notas
     * @param notas notas
     */
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    /**
     * método get curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * método get Alumnos
     */
    public static int getNumAlumnos () { return numAlumnos; }
    
    // public abstract void matricular (Curso curso);
    // public abstract void desmatricular ();

    /**
     * método finalize
     */
    @Override
    protected void finalize() throws Throwable {
        numAlumnos --;
        super.finalize();
    }  

}
