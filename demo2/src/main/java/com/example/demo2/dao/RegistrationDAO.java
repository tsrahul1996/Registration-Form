package com.example.demo2.dao;

import com.example.demo2.Model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by expert on 24/7/19.
 */

@Component(value = "registrationDao")
@Scope("session")
public class RegistrationDAO {

    @Autowired
    RegistrationRepository dao;

    public String save(Registration records) {
          dao.save(records);
    return "";
    }

 /*   public List<RegistrationRecord> selectAllRecords(String procedureName) {

  //      SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("RegistrationSelectAll");
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
   //     Map<String, Object> out = jdbcCall.execute(in);

        RegistrationRecord reg = new RegistrationRecord();
 //       reg.setId(id);
 //       reg.setName((String) out.get("out_name"));

    ArrayList<RegistrationRecord> a=new ArrayList<RegistrationRecord>();
    a.add(reg);
    return a ;
    }*/

/*    public ResultSet selectRecords(String procedureName) {

        String jdbc = "jdbc:mysql://127.0.0.1/RegistrationForm";
        try {
                Connection conn = DriverManager.getConnection(jdbc, "root", "expert");
            CallableStatement statement = conn.prepareCall("{call RegistrationSelectAll(?)}")


            statement.setInt(1, 5);

            boolean hadResults = statement.execute();

            // print headings

            while (hadResults) {
                ResultSet resultSet = statement.getResultSet();

                // process result set
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");

                }

                hadResults = statement.getMoreResults();
            }
            ResultSet resultSet = statement.getResultSet();

            statement.close();
            return resultSet;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }


    }*/
/*
    public void moveToHistoryTable(Registration person) {
        StoredProcedure procedure = new GenericStoredProcedure();
  //      procedure.setDataSource(dataSource);
        procedure.setSql("RegistrationSelectAll");
        procedure.setFunction(false);

        SqlParameter[] parameters = {
                new SqlParameter(Types.BIGINT),
                new SqlOutParameter("status_out", Types.BOOLEAN)
        };



        procedure.setParameters(parameters);
        procedure.compile();

        Map<String, Object> result = procedure.execute(person.getId());
    }*/
}

