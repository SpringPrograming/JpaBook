package jpabook.jpashop;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

//  @Autowired
//  MemberRepository memberRepository;
//
//  @Test
//  @Transactional
//  @Rollback(value = false)
//  public void testMember() throws Exception {
//    // given
//    Member member = new Member();
//    member.setUsername("memberA");
//
//    // when
//    Long savedId = memberRepository.save(member);
//    Member findMember = memberRepository.find(savedId);
//
//    // then
//    // 같은 영속성 컨텍스트 안에서 db 의 id 가 같으면 같은 객체로 본다.
//    assertThat(findMember.getId()).isEqualTo(member.getId());
//    assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//    assertThat(findMember).isEqualTo(member);
}