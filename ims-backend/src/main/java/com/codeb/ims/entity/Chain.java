package com.codeb.ims.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "chains")
public class Chain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chain_id")
    private Long chainId;

    @Column(name = "chain_name", nullable = false)
    private String chainName;

    @OneToMany(mappedBy = "chain")
    private List<Client> clients;

    public Long getChainId() {
        return chainId;
    }

    public void setChainId(Long chainId) {
        this.chainId = chainId;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
