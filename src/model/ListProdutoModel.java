package model;

public class ListProdutoModel {

    private Integer qtde;
    private ProdutoModel pm;
    private Double vUnitario;
    private Double vTotal;

    public ListProdutoModel() {

    }

    public ListProdutoModel(Integer qtde, ProdutoModel pm, Double vUnitario, Double vTotal) {
        this.qtde = qtde;
        this.pm = pm;
        this.vUnitario = vUnitario;
        this.vTotal = vTotal;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public ProdutoModel getPm() {
        return pm;
    }

    public void setPm(ProdutoModel pm) {
        this.pm = pm;
    }

    public Double getVUnitario() {
        return vUnitario;
    }

    public void setVUnitario(Double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public Double getVTotal() {
        return vTotal;
    }

    public void setVTotal(Double vTotal) {
        this.vTotal = vTotal;
    }
}
