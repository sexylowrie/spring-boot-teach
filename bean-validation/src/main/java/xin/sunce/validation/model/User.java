package xin.sunce.validation.model;

import xin.sunce.validation.validation.IsCardConstraintValidator;
import xin.sunce.validation.validation.constraints.IsCard;

import javax.validation.constraints.NotNull;

/**
 * 用户模型
 *
 * @author lowrie
 * @date 2020-02-11
 */
public class User {

    @NotNull
    private long id;

    @NotNull
    private String name;

    @IsCard
    private String cardNo;

    @IsCard(groups = IsCardConstraintValidator.Card.class,expect = "GBK")
    private String card;

    @IsCard(groups = IsCardConstraintValidator.No.class,expect = "GBK")
    private String no;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
