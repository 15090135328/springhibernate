package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_student", schema = "test", catalog = "")
public class TStudentEntity {
    private int id;
    private String name;
    private Integer gid;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gid", nullable = true)
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TStudentEntity that = (TStudentEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (gid != null ? !gid.equals(that.gid) : that.gid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TStudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gid=" + gid +
                '}';
    }
}
