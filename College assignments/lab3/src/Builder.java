public interface Builder {
    public void reset();
    public void stepName(String name);
    public void stepClass(String classe);
    public void stepStats( int strength, int speed, int inteligence, int senses, int dexterity, int adaptability, int health);
    public void stepEquip(String equipamento1, String equipamento2);
}
