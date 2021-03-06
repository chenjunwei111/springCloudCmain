package com.example.cmainclient01.sys.service.impl;

import com.example.cmainclient01.sys.entity.TradeObject;
import com.example.cmainclient01.sys.mapper.TradeObjectMapper;
import com.example.cmainclient01.sys.service.TradeObjectService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 模拟对象信息，用于模拟参与交易的市场主体 服务实现类
 * </p>
 *
 * @author cjw
 * @since 2021-03-04
 */
@Service
public class TradeObjectServiceImpl extends ServiceImpl<TradeObjectMapper, TradeObject> implements TradeObjectService {

}
