package com.PMS.service.impl;

import com.PMS.entity.Admin;
import com.PMS.mapper.AdminMapper;
import com.PMS.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jianan
 * @since 2020-02-29
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
