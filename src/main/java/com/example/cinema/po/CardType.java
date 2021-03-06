package com.example.cinema.po;

import com.example.cinema.vo.CardTypeForm;

/**
 * @date 2019-5-20
 * @author zhm
 */
public class CardType {
    /**
     * 会员卡类型id
     */
    private int id;

    /**
     * 会员卡名称
     */
    private String name;

    /**
     * 会员卡描述
     */
    private String description;

    /**
     * 会员卡购买价格
     */
    private double price;

    /**
     * 充值会员卡获得优惠的需满金额
     */
    private double topUpTarget;

    /**
     * 充值会员卡时的优惠金额
     */
    private double topUpDiscount;

    /**
     * 购票获得优惠的需满金额
     */
    private double ticketTarget;

    /**
     * 购票时的优惠金额
     */
    private double ticketDiscount;


    public CardType() {
    }

    public CardType(CardTypeForm cardTypeForm) {
        name = cardTypeForm.getName();
        description = cardTypeForm.getDescription();
        price = cardTypeForm.getPrice();
        topUpTarget = cardTypeForm.getTopUpTarget();
        topUpDiscount = cardTypeForm.getTopUpDiscount();
        ticketTarget = cardTypeForm.getTicketTarget();
        ticketDiscount = cardTypeForm.getTicketDiscount();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTopUpTarget() {
        return topUpTarget;
    }

    public void setTopUpTarget(double topUpTarget) {
        this.topUpTarget = topUpTarget;
    }

    public double getTopUpDiscount() {
        return topUpDiscount;
    }

    public void setTopUpDiscount(double topUpDiscount) {
        this.topUpDiscount = topUpDiscount;
    }

    public double getTicketTarget() {
        return ticketTarget;
    }

    public void setTicketTarget(double ticketTarget) {
        this.ticketTarget = ticketTarget;
    }

    public double getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(double ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
    }
}
