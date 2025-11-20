package br.com.fiap.game.model;

// import br.com.fiap.game.model.HabilidadeEspecial;
// import br.com.fiap.game.model.Item;

public class PersonagemMagico {
    // Atributos
    private String nome;
    private String poderMagico;
    private int nivelMana;

    // Objetos
    private HabilidadeEspecial habilidade;
    private Item item;

    // Construtor
    public PersonagemMagico(String nome, String poderMagico, int nivelMana) {
        this.nome = nome;
        this.poderMagico = poderMagico;
        this.nivelMana = nivelMana;
    }

    // Métodos
    public void atacar(String ataque) {
        if (nivelMana >= 10) {
            System.out.printf("%s realizou um ataque: %s!%n", nome, ataque);
            nivelMana -= 10;
        } else {
            System.out.printf("%s está sem energia para atacar.", nome);
        }
    }

    public int aumentarMana(int mana) {
        nivelMana = nivelMana + mana;
        return nivelMana;
    }

    public void ativarHabilidadeEspecial() {
        if (!habilidade.isHabilitada()) {
            System.out.println("Habilidade especial não está ativa. Ativando a habilidade");
            habilidade.setHabilitada(true);
            System.out.printf("Habilidade %s agora está ativa%n", habilidade.getNomeHabilidade());
        } else if (nivelMana >= habilidade.getCustoMana()) {
            System.out.printf("Ativando a Habilidade: %s%n", habilidade.getNomeHabilidade());
            nivelMana -= habilidade.getCustoMana();
        } else {
            System.out.printf("%s está sem energia para a habilidade especial", nome);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getNivelMana() {
        return nivelMana;
    }

    public void setNivelMana(int nivelMana) {
        this.nivelMana = nivelMana;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidade;
    }

    public void setHabilidadeEspecial(HabilidadeEspecial habilidade) {
        this.habilidade = habilidade;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
