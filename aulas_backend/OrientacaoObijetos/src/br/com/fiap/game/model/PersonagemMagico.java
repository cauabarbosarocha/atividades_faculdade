package br.com.fiap.game.model;
import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.Item;

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

    public int aumentarMana(int mana){
        nivelMana = nivelMana + mana;
        return nivelMana;
    }

    public void ativarHabilidadeEspecial() {
        if (!habilidade.habilitada) {
            System.out.println("Habilidade especial não está ativa. Ativando a habilidade");
            habilidade.habilitada = true;
            System.out.printf("Hbilidade %s agora está ativa%n", habilidade.nomeHabilidade);
        } else if (nivelMana >= habilidade.custoMana) {
            System.out.printf("Ativando a Habilidade: %s%n", habilidade.nomeHabilidade);
            nivelMana -= habilidade.custoMana;
        } else {
            System.out.printf("%s está sem energia para a habilidade especial", nome);
        }
    }
}
