package org.hannaweldehana.weldehana_hanna_claimsmanagment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name = "user_roles")
public class Role implements Serializable {

    @Getter
    @Setter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
/*
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User users;
*/
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role roles;

    // Getters and setters handled by Lombok
}

