package poli.edu.co.tallerfinal.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter

@Table(name = "Show_Times")
public class Showtimes {

    @Id
    @Column(name = "id_show_time")
    private Long id;

    private Date date;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "showTime")
    private List<Movies> movies;
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Showtimes showtimes)) return false;
        return Objects.equals(getId(), showtimes.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
