/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abcbankpack.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JUDE
 */
@Entity
@Table(name = "AccountUsers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountUsers.findAll", query = "SELECT a FROM AccountUsers a"),
    @NamedQuery(name = "AccountUsers.findByCAu", query = "SELECT a FROM AccountUsers a WHERE a.cAu = :cAu"),
    @NamedQuery(name = "AccountUsers.findByCusername", query = "SELECT a FROM AccountUsers a WHERE a.cusername = :cusername"),
    @NamedQuery(name = "AccountUsers.findByCpassword", query = "SELECT a FROM AccountUsers a WHERE a.cpassword = :cpassword")})
public class AccountUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cAu")
    private String cAu;
    @Basic(optional = false)
    @Column(name = "cusername")
    private String cusername;
    @Basic(optional = false)
    @Column(name = "cpassword")
    private String cpassword;

    public AccountUsers() {
    }

    public AccountUsers(String cAu) {
        this.cAu = cAu;
    }

    public AccountUsers(String cAu, String cusername, String cpassword) {
        this.cAu = cAu;
        this.cusername = cusername;
        this.cpassword = cpassword;
    }

    public String getCAu() {
        return cAu;
    }

    public void setCAu(String cAu) {
        this.cAu = cAu;
    }

    public String getCusername() {
        return cusername;
    }

    public void setCusername(String cusername) {
        this.cusername = cusername;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cAu != null ? cAu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountUsers)) {
            return false;
        }
        AccountUsers other = (AccountUsers) object;
        if ((this.cAu == null && other.cAu != null) || (this.cAu != null && !this.cAu.equals(other.cAu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "abcbankpack.entity.AccountUsers[ cAu=" + cAu + " ]";
    }
    
}
