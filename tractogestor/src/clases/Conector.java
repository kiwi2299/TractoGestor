package clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conector {
	private static Connection conn;
	private final String driver = "com.mysql.jdbc.Driver";
	private final String user = "root";
	private final String password = "";
	private final String url = "jdbc:mysql://localhost:3306/TractoGestor";

	public Conector(){
		conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			if(conn != null){
				System.out.println("Conexion establecida");

			}
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("error al conectar"+e);
		}
	}

	//este metodo nos retorna la conexion
	public Connection getConnection(){
		return conn;
	}
	//con este metodo nos desconectamos de la bd
	public void desconectar(){
		conn = null;
		if(conn == null){
			System.out.println("Conexion terminada");
		}
	}
        
    public ArrayList<String> consultaSQL(String consultaQ , String campoBuscar){       

        ArrayList<String> resultado = new ArrayList<>();


        try{
            
                      
            conn = getConnection();
            
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(consultaQ); //...Solicitud
            
            ResultSet res = ps.executeQuery();//...............aqui se guardan los resultados
            
            while(res.next()){
                
                //System.out.println(res.getString("nombre"));
                resultado.add(res.getString(campoBuscar));
                
                
            }
                
            
            //conn.close();                   
            
                
        }catch(SQLException e){
            
            System.out.println(e);
            
        }

        return resultado;

    }
    
     public void altaSQL(String consultaQ){       

        
        try{
            
                      
            conn = getConnection();
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(consultaQ);
            
            //con.close();                   
            
                
        }catch(SQLException e){
            
            System.out.println(e);
            
        }    

    }



    public void bajaSQL(String consultaQ){
        
        try{
            
            
                      
            conn = getConnection();
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(consultaQ);
            
            //conn.close();                   
            
                
        }catch(SQLException e){
            
            System.out.println(e);
            
        }    

    }
}
