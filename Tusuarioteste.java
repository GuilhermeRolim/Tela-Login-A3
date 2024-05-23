package a3.MODELteste;

import a3.DAOteste.CadastrousuarioDAO;
import a3.DAOteste.TusuariotesteDAO;

/**
 *
 * @author lucas
 */
public class Tusuarioteste {

    private String cpf;
    private String senha;
    private String nome;
    private String tel;
    private String end;
    private String email;

    public Tusuarioteste(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Tusuarioteste() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean inserir() {

        CadastrousuarioDAO dao = new CadastrousuarioDAO();
        return dao.cadastro(this);

    }

    public boolean cadastro() {

        CadastrousuarioDAO dao = new CadastrousuarioDAO();
        return dao.cadastro(this);

    }

    public boolean logar() {
        TusuariotesteDAO usuDAO = new TusuariotesteDAO();
        return usuDAO.login(this);
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
