package com.nf.lc.service.imp;

import com.nf.lc.dao.AdminMapper;
import com.nf.lc.entity.Admin;
import com.nf.lc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    @Override
    public Admin selectByPrimaryKey(Integer adminId) {
        return null;
    }

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }
}
