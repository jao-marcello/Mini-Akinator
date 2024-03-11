public class Super {
    private String nome;
    private String Franquia;
    private boolean sexo; //True = Male / False = Female
    private boolean carater; // True = Good / False = Bad
    private boolean super_inteligencia;
    private boolean mascara;
    private boolean armadura;
    private boolean capa;
    private boolean tecnologia;
    private boolean apetrechos;
    private boolean milhonario;
    private boolean poder;
    private boolean força;
    private boolean velocidade;
    private boolean voar;
    private boolean teia;
    private boolean resistencia;
    private boolean regeneração;
    
    

    public Super(String nome, String franquia, boolean sexo, boolean carater, boolean super_inteligencia,
            boolean mascara, boolean armadura, boolean capa, boolean tecnologia, boolean apetrechos, boolean milhonario,
            boolean poder, boolean força, boolean velocidade, boolean voar, boolean teia, boolean resistencia,
            boolean regeneração) {
        this.nome = nome;
        Franquia = franquia;
        this.sexo = sexo;
        this.carater = carater;
        this.super_inteligencia = super_inteligencia;
        this.mascara = mascara;
        this.armadura = armadura;
        this.capa = capa;
        this.tecnologia = tecnologia;
        this.apetrechos = apetrechos;
        this.milhonario = milhonario;
        this.poder = poder;
        this.força = força;
        this.velocidade = velocidade;
        this.voar = voar;
        this.teia = teia;
        this.resistencia = resistencia;
        this.regeneração = regeneração;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFranquia() {
        return Franquia;
    }

    public void setFranquia(String franquia) {
        Franquia = franquia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isCarater() {
        return carater;
    }

    public void setCarater(boolean carater) {
        this.carater = carater;
    }

    public boolean isSuper_inteligencia() {
        return super_inteligencia;
    }

    public void setSuper_inteligencia(boolean super_inteligencia) {
        this.super_inteligencia = super_inteligencia;
    }

    public boolean isMascara() {
        return mascara;
    }

    public void setMascara(boolean mascara) {
        this.mascara = mascara;
    }

    public boolean isArmadura() {
        return armadura;
    }

    public void setArmadura(boolean armadura) {
        this.armadura = armadura;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public boolean isTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(boolean tecnologia) {
        this.tecnologia = tecnologia;
    }

    public boolean isApetrechos() {
        return apetrechos;
    }

    public void setApetrechos(boolean apetrechos) {
        this.apetrechos = apetrechos;
    }

    public boolean isMilhonario() {
        return milhonario;
    }

    public void setMilhonario(boolean milhonario) {
        this.milhonario = milhonario;
    }

    public boolean isPoder() {
        return poder;
    }

    public void setPoder(boolean poder) {
        this.poder = poder;
    }

    public boolean isForça() {
        return força;
    }

    public void setForça(boolean força) {
        this.força = força;
    }

    public boolean isVelocidade() {
        return velocidade;
    }

    public void setVelocidade(boolean velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isVoar() {
        return voar;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    public boolean isTeia() {
        return teia;
    }

    public void setTeia(boolean teia) {
        this.teia = teia;
    }

    public boolean isResistencia() {
        return resistencia;
    }

    public void setResistencia(boolean resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isRegeneração() {
        return regeneração;
    }

    public void setRegeneração(boolean regeneração) {
        this.regeneração = regeneração;
    }

   



    
}
