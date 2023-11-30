package com.stir.mobil.angkasa.dao.Impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import com.stir.mobil.angkasa.beans.Cabang;
import com.stir.mobil.angkasa.dao.ICabangDao;

@Repository
public class CabangDaoImpl implements ICabangDao{

    final static Logger logger = LoggerFactory.getLogger(CabangDaoImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void deleteCabangById(String id) {
       String sqlDelete = "delete from public.tbl_mt_cabang where id_cabang=" + id;
        jdbcTemplate.execute(sqlDelete);        
    }

    @Override
    public List<Cabang> getAllCabang() {
        String sqlGet = "select * from public.tbl_mt_cabang";
        List<Cabang> result = jdbcTemplate.execute(sqlGet, new PreparedStatementCallback<List<Cabang>>() {

            @Override
            public List<Cabang> doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                    ps.execute();
                    ResultSet rs = ps.getResultSet();
                    List<Cabang> cbList = new ArrayList<Cabang>();
                    Cabang cb = null;
                    while (rs.next()) {
                        cb = new Cabang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                        cbList.add(cb);
                    }
                    return cbList;
            }
            
        });
        return result;
    }

    @Override
    public Cabang getCabang(String id) {
        String sqlGet = "select * from public.tbl_mt_cabang where id = ?";
        Cabang cabang = jdbcTemplate.execute(sqlGet, new PreparedStatementCallback<Cabang>() {

            @Override
            public Cabang doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.execute();
                ResultSet rs = ps.getResultSet();
                Cabang cb = null;
                if (rs.next()) {
                    cb = new Cabang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                }
                return cb;
                
            }
            
        });
        return cabang;
    }

    @Override
    public void insertCabang(Cabang cb) {
        String sql = "insert into public.tbl_mt_cabang(id_cabang, nama_cabang, alamat, kota) VALUES ( ?, ?, ?, ?)";

        int rs = jdbcTemplate.update(sql, cb.getIdCabang(), cb.getNama(), cb.getAlamat(), cb.getKota());     
         logger.info("created "+rs+" rows data where id :" + cb.getIdCabang());
    }

    @Override
    public void updateCabangById(String id, String name, String alamat, String kota) {
        String sqlUpdate = "update public.tbl_mt_cabang set nama_cabang=?, alamat=?, kota=? where id_cabang=?";
        int rs = jdbcTemplate.update(sqlUpdate, name, alamat, kota, id);
        logger.info("updated "+rs+" rows data");
    }
    

    
    
}
