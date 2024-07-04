package com.choodsire666.litemall.db.service;

import com.choodsire666.litemall.db.dao.AdminMapper;
import com.choodsire666.litemall.db.domain.Admin;
import com.choodsire666.litemall.db.domain.AdminExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 谢金成
 * @date 2024/7/3 16:00
 */
@Service
@Transactional
public class AdminService {

    @Resource
    private AdminMapper adminMapper;

    public List<Admin> findAdmin(String username) {
        AdminExample adminExample = new AdminExample();
        adminExample.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return adminMapper.selectByExample(adminExample);
    }

    public int updateById(Admin admin) {
        admin.setUpdateTime(LocalDateTime.now());
        return adminMapper.updateByPrimaryKeySelective(admin);
    }
}
