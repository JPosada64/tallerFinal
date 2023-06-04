package poli.edu.co.tallerfinal.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter

@Table(name = "Movies")
public class Movies {

    @Id
    @Column(name = "id_movies")
    private Long id;

    private String title;

    private String director;

    private int rating;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_show_time")
    private Showtimes showTime;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_booking")
    private Bookings booking;
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movies movies)) return false;
        return Objects.equals(getId(), movies.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
