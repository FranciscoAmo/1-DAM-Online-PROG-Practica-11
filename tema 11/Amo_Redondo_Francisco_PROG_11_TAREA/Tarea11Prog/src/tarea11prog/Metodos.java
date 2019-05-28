package tarea11prog;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




// Esta clase se usa para crear todos los metodos que usaran las interfaces para comunicarse con la BD


public class Metodos {

    protected Connection conexion;
    protected Statement sentencias;
    protected ResultSet resultset;
    protected PreparedStatement pe;

    public static boolean conectado;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSentencias() {
        return sentencias;
    }

    public void setSentencias(Statement sentencias) {
        this.sentencias = sentencias;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

    public static void setConectado(boolean conectado) {
        Metodos.conectado = conectado;
    }

    public Metodos() {

    }

        // clase que conecta con la base de datos
    public void conectarBD(String basedatos, String usuario, String password) {
        String claseNombremysql = "com.mysql.jdbc.Driver";
        String host = "localhost";

        String conexionsql = "jdbc:mysql://" + host + "/" + basedatos;

        try {

            Class.forName(claseNombremysql);
            conexion = DriverManager.getConnection(conexionsql, usuario, password);
            conexion.setAutoCommit(true);
            Metodos.conectado = true;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            Metodos.conectado = false;
        }

    }

    // clase que crea las tablas
    public void creartabla(String nombretabla) {

        // para la tabla Clientes
        if (nombretabla.equalsIgnoreCase("Clientes")) {
            try {
                if (existetabla("Clientes")) {
                    JOptionPane.showMessageDialog(null, "tabla Clientes Ya esta Creada", "procedo abortado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    pe = conexion.prepareStatement("create table notaria." + nombretabla + "( Codigo Integer Primary Key,nomcli varchar(30),telefono varchar(20));");
                    pe.execute();

                    JOptionPane.showMessageDialog(null, "tabla Escritura Creada", "Creado", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        // para la tabla Escrituras
        if (nombretabla.equalsIgnoreCase("Escrituras")) {
            try {
                if (existetabla("Escrituras")) {
                    JOptionPane.showMessageDialog(null, "tabla Escritura Ya esta Creada", "procedo abortado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    pe = conexion.prepareStatement("create table notaria." + nombretabla + "( Codigo Integer Primary Key,tipo varchar(20),nomfich varchar(50),num_interv Integer);");
                    pe.execute();

                    JOptionPane.showMessageDialog(null, "tabla Escritura Creada", "Creado", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al crear la Tabla ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        // para la tabla EscriturasCliente
        if (nombretabla.equalsIgnoreCase("EscriturasCliente")) {
            try {
                if (existetabla("EscriturasCliente")) {
                    JOptionPane.showMessageDialog(null, "tabla EscrituraCliente Ya esta Creada", "procedo abortado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    pe = conexion.prepareStatement("create table notaria." + nombretabla + "( CodCli Integer ,CodEs Integer, PRIMARY KEY(CodCli,CodEs),FOREIGN KEY(CodCli) REFERENCES notaria.Clientes(Codigo)on delete cascade on update cascade,FOREIGN KEY(CodEs) REFERENCES notaria.Escrituras(Codigo)on delete cascade on update cascade);");
                    pe.execute();

                    JOptionPane.showMessageDialog(null, "tablaEscriturasCliente Creada", "Creado", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al crear la Tabla ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    // comprueba si en los metadatos de la BD existe la tabla
    public boolean existetabla(String nombretabla) throws SQLException {
        boolean existe = false;

       
        try {
            
            DatabaseMetaData metadata = conexion.getMetaData();
            ResultSet rs1 = metadata.getTables(null, null, null, new String[]{"TABLE"});

            while (rs1.next()) {

                if (rs1.getString("TABLE_NAME").equalsIgnoreCase(nombretabla)) {
                    existe = true;
                    break;
                }
            }

        } catch (SQLException ex) {
            existe = false;

        }
        return existe;
    }

    
    // este metodo se usa para mostrar una imagen en un Jlabel
    public void mostrarImagen(JLabel lbl, String tipoimagen) {
        String rutacarpeta = "imagenes\\";

        lbl.setIcon(new ImageIcon(rutacarpeta + tipoimagen));
    }

    // inserta en la tabla Clientes
    public void InsertarCliente(int Codigo, String nombre, String telefono) {
        try {
            String tabla = "Clientes";

            if (!existe(Codigo, tabla)) {

                conectarBD("notaria", "root", "system");
                pe = conexion.prepareStatement("insert into notaria.clientes values(" + Codigo + "," + nombre + "," + telefono + ")");
                pe.execute();

                JOptionPane.showMessageDialog(null, "Registro añadido", "Introducido con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El Registro ya existe", "Operacion cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Comprueba en las tablas Clientes o Escritura si existe ya el registro
    public boolean existe(int Codigo, String tabla) {

        boolean existe = false;

        try {
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select codigo from notaria." + tabla + ";");

            resultset = pe.executeQuery();

            while (resultset.next()) {

                if (resultset.getInt(1) == Codigo) {
                    existe = true;
                    break;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return existe;

    }
    
    //Inserta un registro en la tabla Escrituras
    public void InsertarEscritura(int Codigo, String tipo, String nomfich, int num_interv) {
        try {
            String tabla = "Escrituras";

            if (!existe(Codigo, tabla)) {

                conectarBD("notaria", "root", "system");
                pe = conexion.prepareStatement("insert into notaria.escrituras values(" + Codigo + ",'" + tipo + "','" + nomfich + "'," + num_interv + ");");
                pe.execute();

                JOptionPane.showMessageDialog(null, "Registro  añadido", "Introducido con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El Registro ya existe", "Operacion cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // obtrengo un array con los valores de los codigos de cada registro 
    // ya que es clave primaria
    public int[] obtenerCodigoTabla(String columna, String tabla) {

        int[] valores = new int[contarvaloresTabla(tabla)];
        int aux;
        int contador = 0;
        try {

            // conecto creo la instruccion y la ejecuto
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select " + columna + " from notaria." + tabla + ";");
            resultset = pe.executeQuery();
            
            // voy guardano los valores de la tabla en un array llamado valores
            while (resultset.next()) {
                aux = resultset.getInt(1);
                valores[contador] = aux;
                contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return valores;
    }

    // cuento el numero de  registros que tiene una tabla 
    public int contarvaloresTabla(String tabla) {
        int numero = 0;
        try {
            
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select count(*) from notaria." + tabla + ";");
            resultset = pe.executeQuery();
            resultset.next();
            
            numero = resultset.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;
    }

    // inserto un registro en la tabla cliente
    public void InsertarEscrituraCliente(int CodigoCliente, int CodigoEscritura) {
        try {
            String tabla = "escriturascliente";


            if (!existenDatosTablaEscCli(CodigoCliente, CodigoEscritura)) {

                conectarBD("notaria", "root", "system");
                pe = conexion.prepareStatement("insert into notaria.Escriturascliente values(" + CodigoCliente + "," + CodigoEscritura + ");");
                pe.execute();

                JOptionPane.showMessageDialog(null, "Registro añadido", "Introducido con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El Registro  ya existe", "Operacion cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Debes Introducir valores", "Operacion cancelada", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    // compruebo si los dos codigos son iguales a una fila de la tabal EscRitura-Clientes 
    //para no repetir valores
    
    public boolean existenDatosTablaEscCli(int valor1, int valor2) {

        int valorCli = 0;
        int valorEsc = 0;
        boolean existe = false;
        try {
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select * from notaria.EscriturasCliente;");
            resultset = pe.executeQuery();
            while (resultset.next()) {

                valorCli = resultset.getInt(1);
                valorEsc = resultset.getInt(2);

                if ((valorCli == valor1) && (valorEsc == valor2)) {

                    existe = true;
                    break;
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return existe;
    }

    // obtengo los valores de cada de filas de una tabla y las guardo en un arrayList
    
    public ArrayList obtenerFilasTabla(String tabla) {

        int numcolumnas = obtenerNumeroAtributos(tabla);

        Object[] fila;
        ArrayList <Object>valores = new ArrayList();
       

        try {

            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select * from notaria." + tabla + ";");
            resultset = pe.executeQuery();
            while (resultset.next()) {
                
                
                    fila= new Object[numcolumnas];
                    
                    for (int i = 0; i < numcolumnas; i++) {
                        fila[i]= resultset.getString(i+1);
              
                      
                    }
                    valores.add(fila);
            }
                
            } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }

        return valores;
    }

    // obtengo en numero de atributos o columnas que tiene la tabla 
    public int obtenerNumeroAtributos(String tabla) {
        int numcolumnas = 0;
        try {
            conectarBD("notaria", "root", "system");
            DatabaseMetaData metadata = conexion.getMetaData();
            ResultSet rs1 = metadata.getColumns(null, null, tabla, null);

            while (rs1.next()) {

                numcolumnas++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numcolumnas;
    }
    
    // borrar un registro en funcion de su codigo
    public void borrarRegistro(String Codigo,String tabla){
            
        try {
            if(tabla.equalsIgnoreCase("EscriturasCliente")){
                
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("delete from notaria."+tabla+" where "+tabla+".CodCli="+Codigo+";");
            pe.execute();
            
            JOptionPane.showMessageDialog(null, "Registro borrado", "registro borrado", JOptionPane.INFORMATION_MESSAGE);
            
            
            
            }else{
 
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("delete from notaria."+tabla+" where "+tabla+".Codigo="+Codigo+";");
            pe.execute();
            
            JOptionPane.showMessageDialog(null, "Registro borrado", "registro borrado", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }

    // modifica un registro en funcion de su codigo
    
    // este metodo es para la tabla escrituras
    public void ModificarRegistro(int codigoinicial,int Codigo, String tipo, String fichero, int intervinientes) {
        
        try {
            String tabla="escrituras";
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("Update notaria.escrituras set Codigo="+Codigo+", tipo='"+tipo+"', nomfich='"+fichero+"', num_interv="+intervinientes+" where codigo="+codigoinicial+";");
            pe.execute();
            
             JOptionPane.showMessageDialog(null,"Registro Modificado","Accion Realizada",JOptionPane.INFORMATION_MESSAGE);   
            } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }
    
    // este metodo es para la tabla EscriturasCliente
     public void ModificarRegistro(int codigoinicialCli,int codigoinicialEsc, int CodigoCli, int CodigoEs) {
        
        try {
           
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("Update notaria.escriturascliente set CodCli="+CodigoCli+",CodEs="+CodigoEs+" where CodCli="+codigoinicialCli+" and CodEs="+codigoinicialEsc+";");
            pe.execute();
            JOptionPane.showMessageDialog(null,"Registro Modificado","Accion Realizada",JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error Posible Registro duplicado","Accion abortada",JOptionPane.WARNING_MESSAGE);
            }
        
        
        
    }
     
     // este metodo es para la tabla Clientes
    public void ModificarRegistro(int codigoinicial,int Codigo, String Nombre, String Telefono) {
        
        try {
            String tabla="Clientes";
            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("Update notaria."+tabla +" set Codigo="+Codigo+", nomcli="+Nombre+", telefono="+Telefono+" where Codigo="+codigoinicial+";");
             pe.execute();
            
            JOptionPane.showMessageDialog(null,"Registro Modificado","Accion Realizada",JOptionPane.INFORMATION_MESSAGE);   
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error Posible Registro duplicado","Accion abortada",JOptionPane.WARNING_MESSAGE);
            }
        
        
        
    }
  
    // comprueba que los valores sean numeros
    public boolean sonnumeros(String valor){
        boolean valido=true;
    
        try{
            Integer.parseInt(valor);
        
        }catch(NumberFormatException ime){
         
            valido=false;
        }
    
    return valido;
    }
    
    
    
    
    
    
    
    public ArrayList buscarConsulta(int Codigo){
    
        int numcolumnas =5;

        Object[] fila;
        ArrayList <Object>valores = new ArrayList();
    try {

            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select c.codigo, e.codigo, c.nomcli, e.tipo,e.nomfich from notaria.clientes c, notaria.escrituras e, notaria.escriturascliente ec where c.codigo=ec.codCli and e.codigo=ec.CodEs and c.codigo="+Codigo+";");
            resultset = pe.executeQuery();
            while (resultset.next()) {
                
                
                    fila= new Object[numcolumnas];
                    
                    for (int i = 0; i < numcolumnas; i++) {
                        fila[i]= resultset.getString(i+1);
              
                      
                    }
                    valores.add(fila);
            }
                
            } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
    return valores;
    }
    
    
     public ArrayList buscarConsulta(String Tipo ){
    
        int numcolumnas =5;

        Object[] fila;
        ArrayList <Object>valores = new ArrayList();
    try {

            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select c.codigo, e.codigo, c.nomcli, e.tipo,e.nomfich from notaria.clientes c, notaria.escrituras e, notaria.escriturascliente ec where c.codigo=ec.codCli and e.codigo=ec.CodEs and e.tipo='"+Tipo+"';");
            resultset = pe.executeQuery();
            while (resultset.next()) {
                
                
                    fila= new Object[numcolumnas];
                    
                    for (int i = 0; i < numcolumnas; i++) {
                        fila[i]= resultset.getString(i+1);
              
                      
                    }
                    valores.add(fila);
            }
                
            } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
    return valores;
    }
   
     
      public ArrayList buscarConsulta(int Codigo,String Tipo ){
    
        int numcolumnas =5;

        Object[] fila;
        ArrayList <Object>valores = new ArrayList();
    try {

            conectarBD("notaria", "root", "system");
            pe = conexion.prepareStatement("select c.codigo, e.codigo, c.nomcli, e.tipo,e.nomfich from notaria.clientes c, notaria.escrituras e, notaria.escriturascliente ec where c.codigo=ec.codCli and e.codigo=ec.CodEs and c.codigo="+Codigo+" and e.tipo='"+Tipo+"';");
            resultset = pe.executeQuery();
            while (resultset.next()) {
                
                
                    fila= new Object[numcolumnas];
                    
                    for (int i = 0; i < numcolumnas; i++) {
                        fila[i]= resultset.getString(i+1);
              
                      
                    }
                    valores.add(fila);
            }
                
            } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
    return valores;
    }
     
}
    
    
