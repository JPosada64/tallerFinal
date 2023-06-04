package poli.edu.co.tallerfinal.persistence.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter

@Table(name = "Bookings")
public class Bookings {

    @Id
    @Column(name = "id_booking")
    private Long id;

    private Long userId;

    private Long showTimeId;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "booking")
    private List<Movies> movies;
    //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bookings bookings)) return false;
        return Objects.equals(getId(), bookings.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
