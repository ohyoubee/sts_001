package com.example.sts_001.repository;

import com.example.sts_001.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
    //        @Query(value = "SELECT COUNT(*) FROM dept WHERE deptno = 1100 AND isworking = '출근전'", nativeQuery = true)
//    public int countDept();
//    @Query(value = "SELECT COUNT(*) FROM dept WHERE deptno = 1100 AND isworking = '출근'", nativeQuery = true)
//    public int countDept2();
//    @Query(value = "SELECT COUNT(*) FROM dept WHERE deptno = 1100 AND isworking = '퇴근'", nativeQuery = true)
//    publ
    // public List<Dept> findAll();
    @Query("SELECT COUNT(d) FROM Dept d WHERE d.deptno = :deptno AND d.isworking = '출근전'")
    Long countPreWork(@Param("deptno") Long deptno);

    @Query("SELECT COUNT(d) FROM Dept d WHERE d.deptno = :deptno AND d.isworking = '출근'")
    Long countWork(@Param("deptno") Long deptno);

    @Query("SELECT COUNT(d) FROM Dept d WHERE d.deptno = :deptno AND d.isworking = '퇴근'")
    Long countLeave(@Param("deptno") Long deptno);

    //    List<Dept> findByDeptno(Long DeptNo);

//    @Query("SELECT d.deptname FROM Dept d WHERE d.deptno = :deptno")
@Query("select d.deptname from Dept d where d.deptno = :deptno group by d.deptno, d.deptname")
    String findDeptnameByDeptno(@Param("deptno") Long deptno);
}






