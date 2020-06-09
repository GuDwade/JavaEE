package gu.model;

import java.util.List;

public class DuckShop {
    private List<Duck>list;

    public List<Duck> getList() {
        return list;
    }

    public void setList(List<Duck> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DuckShop{" +
                "list=" + list +
                '}';
    }
}
