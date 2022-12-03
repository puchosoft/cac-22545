import java.sql.*;

public class Persistencia {
    public static void main(String[] args) {

        // Conexion a la BBDD
        String server = "localhost";
        String puerto = "3306";
        String bbdd = "banco";
        String url = "jdbc:mysql://" + server + ":" + puerto + "/";
        String usuario = "root";
        String password = "1234";



        try {
            // Creacion de la conexion a la bbdd
            Connection con = DriverManager.getConnection(url+bbdd, usuario, password);

            // Creacion del "statement" o cursor que nos permite ejecutar querys SQL
            Statement mysql = con.createStatement();

            // Ejecutamos una consulta
            // (*) Para consultas SELECT se usa el metodo .executeQuery(query)
            // (*) Para consultas UPDATE, INSERT y DELETE se usa el metodo .executeUpdate(query)

            /*
            +----------------+
            | Pruebas SELECT |
            +----------------+
             */
//            String qTraerTodo = "SELECT * FROM usuarios";
//            ResultSet resultado = mysql.executeQuery(qTraerTodo);
//
//            System.out.println();
//            // Mostramos el resultado de la consulta
//            while(resultado.next()) {
//                System.out.print(resultado.getString("nombre") + " ");
//                System.out.print(resultado.getString("apellido") + " - ");
//                System.out.print(resultado.getString("email") + " - ");
//                System.out.println(resultado.getString("pais"));
//            }

            /*
            +----------------+
            | Pruebas INSERT |
            +----------------+
             */
//             String qInsertar = "INSERT INTO usuarios (nombre, apellido, email, pais) VALUES('Maria','Perez','mperez@dominio.com','Argentina')";
//             int regs = mysql.executeUpdate(qInsertar);
//             System.out.println("Registros afectados: "+ regs);

//            // Usamos una consulta "preparada" con ? para reemplazar valores
//            String qInsertPrep = "INSERT INTO usuarios (nombre, apellido, email, pais) VALUES(?, ?, ?, ?)";
//            // Usamos un cursor "preparado" relacionado a la consulta
//            PreparedStatement mysqlPrep = con.prepareStatement(qInsertPrep);
//
//            mysqlPrep.setString(1, "Juan");
//            mysqlPrep.setString(2, "Mendoza");
//            mysqlPrep.setString(3, "jmendoza@gmail.com");
//            mysqlPrep.setString(4, "Uruguay");
//            mysqlPrep.executeUpdate();

            /*
            +----------------+
            | Pruebas UPDATE |
            +----------------+
             */
//            String qUpdatePrep = "UPDATE usuarios SET nombre = ?, apellido = ? WHERE id = ?";
//            PreparedStatement mysqlPrep = con.prepareStatement(qUpdatePrep);
//            mysqlPrep.setString(1, "Leonardo");
//            mysqlPrep.setString(2, "Gomez");
//            mysqlPrep.setInt(3, 7);
//            mysqlPrep.executeUpdate();

            /*
            +----------------+
            | Pruebas DELETE |
            +----------------+
             */
//            String qDeletePrep = "DELETE FROM usuarios WHERE pais = ?";
//            PreparedStatement mysqlPrep = con.prepareStatement(qDeletePrep);
//            mysqlPrep.setString(1, "Colombia");
//            int regs = mysqlPrep.executeUpdate();
//            System.out.println("Registros afectados: "+ regs);

            con.close();

        }catch(SQLException error) {
            error.printStackTrace();
        }
    }
}

