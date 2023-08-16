/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapa03guia01ejercicio04;

import java.util.Objects;

/**
 *
 * @author calga
 */
public class Productos implements Comparable<Productos>{
//public class Productos {
    private Integer codigo;
    private String descripcion;
    private Integer stock;
    private Double precio;
    private Categoria rubro;

    public Productos(Integer codigo, String descripcion, Integer stock, Double precio, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.rubro = rubro;
    }
    
    
    public Productos(){
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public Categoria getRubro(){
        return rubro;
    }
    
    public void setRubro(Categoria rubro){
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Productos t) {
      if(Objects.equals(codigo, t.getCodigo())){
          return 0;
      }else if(codigo > t.getCodigo()){
          return 1;
      }else{
          return -1;
      }
    }
    
}
