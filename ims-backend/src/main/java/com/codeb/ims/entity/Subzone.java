package com.codeb.ims.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "subzones")
public class Subzone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subzone_id")
    private Long subzoneId;

    @Column(name = "subzone_name", nullable = false)
    private String subzoneName;

    @OneToMany(mappedBy = "subzone")
    private List<Client> clients;

    public Long getSubzoneId() {
        return subzoneId;
    }

    public void setSubzoneId(Long subzoneId) {
        this.subzoneId = subzoneId;
    }

    public String getSubzoneName() {
        return subzoneName;
    }

    public void setSubzoneName(String subzoneName) {
        this.subzoneName = subzoneName;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
