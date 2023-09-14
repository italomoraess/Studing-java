public class Pessoa {
  private String name;
  private Integer age;

  Pessoa(String nome, Integer age){
    this.name = nome;
    this.age = age;
  }

  public String retornaName() {
    return this.name;
  }

  public Integer retornaAge() {
    return this.age;
  }

}
