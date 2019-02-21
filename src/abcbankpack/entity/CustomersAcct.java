/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abcbankpack.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JUDE
 */
@Entity
@Table(name = "CustomersAcct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomersAcct.findAll", query = "SELECT c FROM CustomersAcct c"),
    @NamedQuery(name = "CustomersAcct.findByIAcNo", query = "SELECT c FROM CustomersAcct c WHERE c.iAcNo = :iAcNo"),
    @NamedQuery(name = "CustomersAcct.findByVCusName", query = "SELECT c FROM CustomersAcct c WHERE c.vCusName = :vCusName"),
    @NamedQuery(name = "CustomersAcct.findByVCusSurname", query = "SELECT c FROM CustomersAcct c WHERE c.vCusSurname = :vCusSurname"),
    @NamedQuery(name = "CustomersAcct.findByCSex", query = "SELECT c FROM CustomersAcct c WHERE c.cSex = :cSex"),
    @NamedQuery(name = "CustomersAcct.findByVAddress", query = "SELECT c FROM CustomersAcct c WHERE c.vAddress = :vAddress"),
    @NamedQuery(name = "CustomersAcct.findByCPhoneNo", query = "SELECT c FROM CustomersAcct c WHERE c.cPhoneNo = :cPhoneNo"),
    @NamedQuery(name = "CustomersAcct.findByDDate", query = "SELECT c FROM CustomersAcct c WHERE c.dDate = :dDate"),
    @NamedQuery(name = "CustomersAcct.findByMBal", query = "SELECT c FROM CustomersAcct c WHERE c.mBal = :mBal")})
public class CustomersAcct implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iAcNo")
    private Integer iAcNo;
    @Basic(optional = false)
    @Column(name = "vCusName")
    private String vCusName;
    @Basic(optional = false)
    @Column(name = "vCusSurname")
    private String vCusSurname;
    @Column(name = "cSex")
    private String cSex;
    @Basic(optional = false)
    @Column(name = "vAddress")
    private String vAddress;
    @Basic(optional = false)
    @Column(name = "cPhoneNo")
    private String cPhoneNo;
    @Column(name = "dDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dDate;
    // @Max(value=2)  @Min(value=2)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "mBal")
    private BigDecimal mBal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iacno")
    private Collection<Transactions> transactionsCollection;
    @JoinColumn(name = "staffid", referencedColumnName = "staffId")
    @ManyToOne
    private StaffDetails staffid;

    public CustomersAcct() {
    }

    public CustomersAcct(Integer iAcNo) {
        this.iAcNo = iAcNo;
    }

    public CustomersAcct(Integer iAcNo, String vCusName, String vCusSurname, String vAddress, String cPhoneNo, BigDecimal mBal) {
        this.iAcNo = iAcNo;
        this.vCusName = vCusName;
        this.vCusSurname = vCusSurname;
        this.vAddress = vAddress;
        this.cPhoneNo = cPhoneNo;
        this.mBal = mBal;
    }

    public Integer getIAcNo() {
        return iAcNo;
    }

    public void setIAcNo(Integer iAcNo) {
        Integer oldIAcNo = this.iAcNo;
        this.iAcNo = iAcNo;
        changeSupport.firePropertyChange("IAcNo", oldIAcNo, iAcNo);
    }

    public String getVCusName() {
        return vCusName;
    }

    public void setVCusName(String vCusName) {
        String oldVCusName = this.vCusName;
        this.vCusName = vCusName;
        changeSupport.firePropertyChange("VCusName", oldVCusName, vCusName);
    }

    public String getVCusSurname() {
        return vCusSurname;
    }

    public void setVCusSurname(String vCusSurname) {
        String oldVCusSurname = this.vCusSurname;
        this.vCusSurname = vCusSurname;
        changeSupport.firePropertyChange("VCusSurname", oldVCusSurname, vCusSurname);
    }

    public String getCSex() {
        return cSex;
    }

    public void setCSex(String cSex) {
        String oldCSex = this.cSex;
        this.cSex = cSex;
        changeSupport.firePropertyChange("CSex", oldCSex, cSex);
    }

    public String getVAddress() {
        return vAddress;
    }

    public void setVAddress(String vAddress) {
        String oldVAddress = this.vAddress;
        this.vAddress = vAddress;
        changeSupport.firePropertyChange("VAddress", oldVAddress, vAddress);
    }

    public String getCPhoneNo() {
        return cPhoneNo;
    }

    public void setCPhoneNo(String cPhoneNo) {
        String oldCPhoneNo = this.cPhoneNo;
        this.cPhoneNo = cPhoneNo;
        changeSupport.firePropertyChange("CPhoneNo", oldCPhoneNo, cPhoneNo);
    }

    public Date getDDate() {
        return dDate;
    }

    public void setDDate(Date dDate) {
        Date oldDDate = this.dDate;
        this.dDate = dDate;
        changeSupport.firePropertyChange("DDate", oldDDate, dDate);
    }

    public BigDecimal getMBal() {
        return mBal;
    }

    public void setMBal(BigDecimal mBal) {
        BigDecimal oldMBal = this.mBal;
        this.mBal = mBal;
        changeSupport.firePropertyChange("MBal", oldMBal, mBal);
    }

    @XmlTransient
    public Collection<Transactions> getTransactionsCollection() {
        return transactionsCollection;
    }

    public void setTransactionsCollection(Collection<Transactions> transactionsCollection) {
        this.transactionsCollection = transactionsCollection;
    }

    public StaffDetails getStaffid() {
        return staffid;
    }

    public void setStaffid(StaffDetails staffid) {
        StaffDetails oldStaffid = this.staffid;
        this.staffid = staffid;
        changeSupport.firePropertyChange("staffid", oldStaffid, staffid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iAcNo != null ? iAcNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomersAcct)) {
            return false;
        }
        CustomersAcct other = (CustomersAcct) object;
        if ((this.iAcNo == null && other.iAcNo != null) || (this.iAcNo != null && !this.iAcNo.equals(other.iAcNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "abcbankpack.entity.CustomersAcct[ iAcNo=" + iAcNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
