package com.example.cinema.blImpl.sales;

import com.example.cinema.po.Ticket;

/**
 * @author hxw
 * @date 2019-5-29
 */
public interface TicketServiceForBl {

    /**
     * 获取指定电影票信息
     * @param id
     * @return
     */
    Ticket getTicketById(int id);
}
