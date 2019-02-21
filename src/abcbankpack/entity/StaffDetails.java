/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abcbankpack.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JUDE
 */
@Entity
@Table(name = "StaffDetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StaffDetails.findAll", query = "SELECT s FROM StaffDetails s"),
    @NamedQuery(name = "StaffDetails.findByStaffId", query = "SELECT s FROM StaffDetails s WHERE s.staffId = :staffId"),
    @NamedQuery(name = "StaffDetails.findByStaffName", query = "SELECT s FROM StaffDetails s WHERE s.staffName = :staffName"),
    @NamedQuery(name = "StaffDetails.findByStaffLastName", query = "SELECT s FROM StaffDetails s WHERE s.staffLastName = :staffLastName"),
    @NamedQuery(name = "StaffDetails.findByCPhoneNo", query = "SELECT s FROM StaffDetails s WHERE s.cPhoneNo = :cPhoneNo"),
    @NamedQuery(name = "StaffDetails.findByIAge", query = "SELECT s FROM StaffDetails s WHERE s.iAge = :iAge"),
    @NamedQuery(name = "StaffDetails.findByCSex", query = "SELECT s FROM StaffDetails s WHERE s.cSex = :cSex")})
public class StaffDetails implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "staffId")
    private String staffId;
    @Basic(optional = false)
    @Column(name = "staffName")
    private String staffName;
    @Basic(optional = false)
    @Column(name = "staffLastName")
    private String staffLastName;
    @Basic(optional = false)
    @Column(name = "cPhoneNo")
    private String cPhoneNo;
    @Column(name = "iAge")
    private Integer iAge;
    @Basic(optional = false)
    @Column(name = "cSex")
    private String cSex;
    @OneToMany(mappedBy = "staffid")
    private Collection<CustomersAcct> customersAcctCollection;

    public StaffDetails() {
    }

    public StaffDetails(String staffId) {
        this.staffId = staffId;
    }

    public StaffDetails(String staffId, String staffName, String staffLastName, String cPhoneNo, String cSex) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffLastName = staffLastName;
        this.cPhoneNo = cPhoneNo;
        this.cSex = cSex;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        String oldStaffId = this.staffId;
        this.staffId = staffId;
        changeSupport.firePropertyChange("staffId", oldStaffId, staffId);
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        String oldStaffName = this.staffName;
        this.staffName = staffName;
        changeSupport.firePropertyChange("staffName", oldStaffName, staffName);
    }

    public String getStaffLastName() {
        return staffLastName;
    }

    public void setStaffLastName(String staffLastName) {
        String oldStaffLastName = this.staffLastName;
        this.staffLastName = staffLastName;
        changeSupport.firePropertyChange("staffLastName", oldStaffLastName, staffLastName);
    }

    public String getCPhoneNo() {
        return cPhoneNo;
    }

    public void setCPhoneNo(String cPhoneNo) {
        String oldCPhoneNo = this.cPhoneNo;
        this.cPhoneNo = cPhoneNo;
        changeSupport.firePropertyChange("CPhoneNo", oldCPhoneNo, cPhoneNo);
    }

    public Integer getIAge() {
        return iAge;
    }

    public void setIAge(Integer iAge) {
        Integer oldIAge = this.iAge;
        this.iAge = iAge;
        changeSupport.firePropertyChange("IAge", oldIAge, iAge);
    }

    public String getCSex() {
        return cSex;
    }

    public void setCSex(String cSex) {
        String oldCSex = this.cSex;
        this.cSex = cSex;
        changeSupport.firePropertyChange("CSex", oldCSex, cSex);
    }

    @XmlTransient
    public Collection<CustomersAcct> getCustomersAcctCollection() {
        return customersAcctCollection;
    }

    public void setCustomersAcctCollection(Collection<CustomersAcct> customersAcctCollection) {
        this.customersAcctCollection = customersAcctCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffId != null ? staffId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaffDetails)) {
            return false;
        }
        StaffDetails other = (StaffDetails) object;
        if ((this.staffId == null && other.staffId != null) || (this.staffId != null && !this.staffId.equals(other.staffId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return staffId;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
