## 📚 Ресурсы (держи открытыми всё время)

| Тип | Ресурс |
|-----|--------|
| Практика | [Baeldung — Spring Boot практика](https://www.baeldung.com) |
| Официально | [spring.io/guides](https://spring.io/guides) |
| Официально | [Spring Framework Javadoc](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/package-summary.html) |
| Официально | [Official Apache Maven documentation](https://maven.apache.org/guides/) |
| Официально | [Spring Framework Source](https://github.com/spring-projects/spring-framework) |
| JPA/Hibernate | [Vlad Mihalcea — JPA/Hibernate](https://vladmihalcea.com) |
| Hibernate | [Thorben Janssen — Hibernate tips](https://thorben-janssen.com) |
| Архитектура | [Martin Fowler — Architecture Patterns](https://martinfowler.com) |
| PostgreSQL | [PostgreSQL docs — indexes](https://www.postgresql.org/docs/) |
| Spring MVC | [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/) |

### 🎥 YouTube
| # | Ссылка |
|---|--------|
| 1 | https://www.youtube.com/watch?v=lRkIbVWcpg4 |
| 3 | https://www.youtube.com/watch?v=plbIWp4F_g0&list=PL0lO_mIqDDFUzG5WOCUVmqx4CBW2qIulV&index=1 |
| 4 | https://www.youtube.com/watch?v=hX-EIROSJRI |
| 5 | https://www.youtube.com/watch?v=dS2P-cV-Uzg |
| 6 | https://www.youtube.com/watch?v=xjusSinmONg |
| 8 | https://www.youtube.com/watch?v=Z4hMFBvCDV4 |
| 11 | https://www.youtube.com/watch?v=_RSAS-gIjGo |
| 12 | https://www.youtube.com/watch?v=kj7dTH_soFQ |
| 13 | https://www.youtube.com/watch?v=9RFklLvoOr4 |
| 15 | https://www.youtube.com/watch?v=0uwMKktzixU&list=PLiJ76e8LBYQVOHd1G3vva9FGV66sdV3N1 |
| — | https://www.youtube.com/watch?v=L9pOB3uSupA&list=PLt91xr-Pp57T4tvQ4if78_I83QytkUhmG |
| — | https://www.youtube.com/watch?v=NCCQOw5d1lY |
| — | https://www.youtube.com/watch?v=t0MfXYz7_Gk |
| — | https://www.youtube.com/watch?v=oAXG7aUsF2Y |
| — | https://www.youtube.com/watch?v=OyxTqMlRNdU |
| — | https://www.youtube.com/watch?v=v5X2TJrSuCQ |
| — | https://www.youtube.com/watch?v=Cx_sEm0ygIA |
| — | https://www.youtube.com/watch?v=ygu753Apm-0 |
| — | https://www.youtube.com/watch?v=H01NmrEFATI |
| — | https://www.youtube.com/watch?v=c7TIkimWk4g |
| — | https://www.youtube.com/watch?v=KPiFWU8bJDA |
| — | https://www.youtube.com/watch?v=NCCQOw5d1lY&t=4s |




### 📅 ДЕНЬ 2 — 28 августа (пятница)
**Тема: JVM — GC**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Garbage Collectors** | **GC** — G1 (regions, mixed GC, evacuation failure), ZGC, Shenandoah; **Garbage Collectors** — Serial, Parallel, CMS (deprecated), G1, ZGC, Shenandoah — сравнение и выбор |
| ☀️ 14:00–16:30 | **JIT + Оптимизации** | **JIT** — C1/C2 compiler, tiered compilation, deoptimization; **Escape Analysis** — stack allocation, scalar replacement; **TLAB**, **Compressed Oops**, **Safepoints** |
| 🌙 19:00–21:00 | **GC Tuning** | **G1 GC** — `-XX:+UseG1GC`, pause target, region size, mixed GC; **ZGC** — concurrent, sub-millisecond pauses, когда выбрать; **Shenandoah** — concurrent evacuation, Red Hat |

---

### 📅 ДЕНЬ 3 — 29 августа (суббота)
**Тема: JVM — Bytecode, Reflection, MethodHandle**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Bytecode** | **Bytecode** — javap, как читать, invokedynamic |
| ☀️ 14:00–16:30 | **Reflection** | **Reflection** — getDeclaredMethods, setAccessible, performance cost; **Annotation Processing** — APT, как работает во время компиляции |
| 🌙 19:00–21:00 | **MethodHandle** | **MethodHandle** — vs Reflection, LambdaMetafactory |

---

### 📅 ДЕНЬ 4 — 30 августа (воскресенье)
**Тема: Java Concurrency — основы**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **JMM + Visibility** | **Java Memory Model** — happens-before rules, memory barriers; **Visibility** — что видит один поток из другого без синхронизации; **volatile** — visibility, happens-before, не атомарность |
| ☀️ 14:00–16:30 | **Синхронизация** | **synchronization**; **DeadLock**; **Race Condition** — примеры, как воспроизвести и исправить; **wait() / notify() / notifyAll()** — условие, spurious wakeup |
| 🌙 19:00–21:00 | **Locks** | **Lock, ReentrantLock, ReadWriteLock** — vs synchronized; **Concurrency в JVM** — как JVM управляет потоками, monitor object, thread states на уровне JVM |

---

### 📅 ДЕНЬ 5 — 31 августа (понедельник)
**Тема: Java Concurrency — продвинутое**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Atomic + Barriers** | **Atomic\*** — CAS, compare-and-swap, ABA problem; **CountDownLatch, CyclicBarrier, Semaphore** — разница и применение |
| ☀️ 14:00–16:30 | **Thread Pools** | **ExecutorService, ThreadPool, Executor** — internals; **CompletableFuture** — chain, thenApply, thenCompose, exceptionally, allOf |
| 🌙 19:00–21:00 | **Advanced Concurrency** | **ForkJoinPool** — work stealing, рекурсивные задачи; **ConcurrentHashMap, BlockingQueue** — внутренняя реализация; **Virtual Threads** (Project Loom) — создание, ограничения, carrier threads; **Structured Concurrency** — StructuredTaskScope |

---

## 🌱 БЛОК 2 — Java Core (Дни 6–7)
> Быстрый прогон — большинство знаешь из C#.

---

### 📅 ДЕНЬ 6 — 1 сентября (вторник)
**Тема: Java Core — Collections + Streams**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Collections Internals** | **HashMap internals** — hash(), treeify, resize, load factor, capacity; **equals / hashCode contract** — нарушения, последствия |
| ☀️ 14:00–16:30 | **Stream API + Optional** | **Stream API** — lazy evaluation, spliterator, parallel streams; **Optional** — правильное использование, антипаттерны |
| 🌙 19:00–21:00 | **Strings + Exceptions** | **String Pool**, `String.intern()`, **StringBuilder vs StringBuffer**; **Exceptions** — checked vs unchecked, иерархия, try-with-resources, multicatch, custom exceptions, ExceptionInInitializerError |

---

### 📅 ДЕНЬ 7 — 2 сентября (среда)
**Тема: Java Core — NIO + Functional Interfaces**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **NIO** | **NIO** — Channels, Buffers, Selectors, non-blocking I/O |
| ☀️ 14:00–16:30 | **Functional Interfaces** | **Functional Interfaces** — Function, Predicate, Consumer, Supplier, BiFunction и практика |
| 🌙 19:00–21:00 | **Повторение блока 1–2** | Закрепление JVM + Concurrency — пройтись по вопросам, объяснить устно |

---

## 🍃 БЛОК 3 — Spring Core Internals (Дни 8–12)
> Ты знаешь ASP.NET DI — здесь будет "узнавание", не изучение с нуля.

---

### 📅 ДЕНЬ 8 — 3 сентября (четверг)
**Тема: Spring — BeanFactory и BeanDefinition**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **BeanFactory** | `BeanFactory`, `DefaultListableBeanFactory` — как хранит и создаёт бины; `BeanDefinition` — что это, как регистрируется; `BeanDefinitionReader`, `ClassPathBeanDefinitionScanner` |
| ☀️ 14:00–16:30 | **Bean Scopes + Context** | **Spring Beans** — scopes (singleton, prototype, request, session), lazy init, depends-on; `ApplicationContext` — иерархия, refresh(), events; **Spring Context** — иерархия контекстов, parent/child context, refresh lifecycle |
| 🌙 19:00–21:00 | **Bean Lifecycle** | `AbstractAutowireCapableBeanFactory` — createBean() полный цикл; **Bean Lifecycle**: instantiation → populate → Aware → BeanPostProcessor → init → use → destroy |

---

### 📅 ДЕНЬ 9 — 4 сентября (пятница)
**Тема: Spring — BeanPostProcessor + AOP + Events**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **BeanPostProcessor** | `BeanPostProcessor` — postProcessBefore/AfterInitialization, примеры (AutowiredAnnotationBeanPostProcessor и др.); `BeanFactoryPostProcessor` — когда вызывается, зачем |
| ☀️ 14:00–16:30 | **FactoryBean + AOP** | `FactoryBean` — vs обычный бин, `&beanName`; **Spring AOP** — `CglibAopProxy`, `ProxyFactory`, `TransactionInterceptor` |
| 🌙 19:00–21:00 | **Spring Events + SpEL** | **Spring Events** — ApplicationEventPublisher, @EventListener, async events; **Spring Expression Language (SpEL)** — синтаксис, применение в @Value, @Conditional |

---

### 📅 ДЕНЬ 10 — 5 сентября (суббота)
**Тема: Spring Boot Internals**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **SpringApplication** | `SpringApplication.run()` — полный путь от main() до готового контекста; `AutoConfiguration` — `AutoConfiguration.imports`, `SpringFactories` |
| ☀️ 14:00–16:30 | **Conditions + Import** | `Condition Evaluation` — как Spring решает включать ли AutoConfiguration, порядок условий; `ConditionEvaluator`, `@Conditional`, `@ConditionalOnClass`, `@ConditionalOnMissingBean`; `ImportSelector`, `DeferredImportSelector` — как работает регистрация конфигураций |
| 🌙 19:00–21:00 | **Config + Profiles** | `ConfigurationClassParser` — разбор `@Configuration` классов; `Environment`, `PropertySources`, `Binder`, `ConfigurationProperties`; `Profiles` — как активируются, priority порядок; `Starter Dependencies` — структура starter (autoconfigure + starter pom), как работает подключение |

---

### 📅 ДЕНЬ 11 — 6 сентября (воскресенье)
**Тема: Spring — Validation, Cache, Scheduling, Async, Transaction**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Validation + Conversion** | **Spring Validation** — `@Valid`, `@Validated`, ConstraintValidator, groups, custom validator; **Spring Conversion** — ConversionService, Converter, GenericConverter, FormatterRegistry |
| ☀️ 14:00–16:30 | **Cache + Scheduling** | **Spring Cache** — `@Cacheable`, `@CacheEvict`, `@CachePut`, CacheManager, TTL; **Spring Scheduling** — `@Scheduled`, cron expression, fixedRate vs fixedDelay, TaskScheduler |
| 🌙 19:00–21:00 | **Async + Transaction** | **Spring Async** — `@Async`, ThreadPoolTaskExecutor, propagation, exception handling; **Spring Transaction** — `@Transactional`, propagation levels (REQUIRED, REQUIRES_NEW, NESTED), isolation, readOnly, rollbackFor |

---

### 📅 ДЕНЬ 12 — 7 сентября (понедельник)
**Тема: Spring Test + DevTools + Практика**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Spring Test + DevTools** | **Spring Test** — `@SpringBootTest`, `@MockBean`, `@SpyBean`, context caching, test slices; **Spring Boot DevTools** |
| ☀️ 14:00–16:30 | **Повторение Spring Core** | Пройтись по всему Spring Core блоку — объяснить устно refresh() pipeline, Bean Lifecycle, AutoConfiguration механизм |
| 🌙 19:00–21:00 | **Практика** | Написать собственный `BeanPostProcessor` с реальной логикой; написать собственный `HandlerInterceptor` |

---

## 🌐 БЛОК 4 — Spring MVC Internals (Дни 13–14)

---

### 📅 ДЕНЬ 13 — 8 сентября (вторник)
**Тема: Spring MVC — Request Pipeline**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **DispatcherServlet** | **Servlet API** — ServletContext, HttpServletRequest/Response; `DispatcherServlet` — полный request pipeline; `DispatcherServlet` → `doDispatch()` |
| ☀️ 14:00–16:30 | **Handler + Adapter** | `HandlerMapping` — `RequestMappingHandlerMapping`, как находит handler; `HandlerAdapter` — `RequestMappingHandlerAdapter`; `ArgumentResolver` — `HandlerMethodArgumentResolver`, как парсится тело запроса |
| 🌙 19:00–21:00 | **MessageConverter + Exception + Return** | `MessageConverter` — `HttpMessageConverter`, JSON, XML; `ExceptionResolver` — `@ControllerAdvice`, `@ExceptionHandler`; `ReturnValueHandler` — как сериализуется ответ |

---

### 📅 ДЕНЬ 14 — 9 сентября (среда)
**Тема: Spring MVC — Filters, Containers, ViewResolver**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Filter vs Interceptor** | `Filter` vs `Interceptor` — разница, когда что использовать; **Embedded containers**: Embedded Tomcat, Undertow, Jetty — как встраиваются, auto-configuration |
| ☀️ 14:00–16:30 | **ViewResolver** | `ViewResolver` — только концепция (для REST не нужен глубоко) |
| 🌙 19:00–21:00 | **Практика** | Написать собственный `ArgumentResolver`; написать собственный `Servlet Filter` |

---

## 🗄 БЛОК 5 — Spring Data + Hibernate / JPA (Дни 15–18)
> Ты знаешь EF Core — Hibernate это тот же паттерн, просто другие названия.

---

### 📅 ДЕНЬ 15 — 10 сентября (четверг)
**Тема: Spring Data JPA + Entity States**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Spring Data JPA** | `Spring Data` — JpaRepository, query methods, `@Query`; `Persistence Context` — first-level cache, scope; `Entity States`: transient → managed → detached → removed |
| ☀️ 14:00–16:30 | **Dirty Checking + Flush** | `Dirty Checking` — как Hibernate знает что изменилось (snapshot); `Flush` — ALWAYS, COMMIT, AUTO — когда SQL уходит в БД |
| 🌙 19:00–21:00 | **Proxy + Lazy + Cascade** | `Proxy` / `Bytecode Enhancement` — lazy loading mechanism; `Lazy Loading` — LazyInitializationException, решения; `Cascade` — CascadeType values, orphanRemoval |

---

### 📅 ДЕНЬ 16 — 11 сентября (пятница)
**Тема: Hibernate — N+1, EntityGraph, Fetch**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **N+1 проблема** | `N+1 проблема` — показать код до и после, как обнаружить, JOIN FETCH, EntityGraph |
| ☀️ 14:00–16:30 | **Entity Graph + Fetch Plan** | `Entity Graph` — @NamedEntityGraph, @EntityGraph в репозитории, ad-hoc graph; `Fetch Plan` — FetchType.LAZY vs EAGER, когда что выбрать |
| 🌙 19:00–21:00 | **Projections + Batching** | **Projections** — interface projection, DTO projection, dynamic projection — быстрее чем полный Entity; `Batching` — hibernate.jdbc.batch_size, batch inserts/updates |

---

### 📅 ДЕНЬ 17 — 12 сентября (суббота)
**Тема: Hibernate — Caches + Locking + DDD**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Second Level Cache** | `Second Level Cache` — как настроить с Ehcache/Redis; `Query Plan Cache` — HQL/JPQL кэш планов |
| ☀️ 14:00–16:30 | **Locking** | `Locking` — Optimistic (@Version), Pessimistic (PESSIMISTIC_WRITE); `Natural ID` — альтернатива поиску по PK; `Statistics` — как включить и читать hibernate.generate_statistics |
| 🌙 19:00–21:00 | **DDD** | **DDD** — Aggregate, Entity, Value Object, Repository, Domain Event, Bounded Context |

---

### 📅 ДЕНЬ 18 — 13 сентября (воскресенье)
**Тема: Maven + Gradle**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Maven** | **Maven/POM** — структура, dependency scopes, `<dependencyManagement>` vs `<dependencies>`, BOM, `nearest definition` (conflict resolution), `mvn dependency:tree`, `mvn dependency:analyze`, `<exclusions>`, lifecycle: validate→compile→test→package→verify→install→deploy, multi-module, profiles |
| ☀️ 14:00–16:30 | **Maven Plugins** | Плагины: `maven-compiler-plugin`, `maven-surefire-plugin`, `maven-failsafe-plugin`, `maven-shade-plugin`, `spring-boot-maven-plugin`, `maven-enforcer-plugin`, `versions-maven-plugin` |
| 🌙 19:00–21:00 | **Gradle** | **Gradle** — `./gradlew bootJar`, `./gradlew dependencies`, Incremental builds, Build cache, `implementation`/`runtimeOnly`/`testImplementation` конфигурации |

---

## 🔐 БЛОК 6 — Spring Security (Дни 19–20)
> ASP.NET Identity + JWT Bearer — знаешь. Просто другие классы.

---

### 📅 ДЕНЬ 19 — 14 сентября (понедельник)
**Тема: Spring Security — FilterChain + Authentication**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **FilterChain** | `FilterChain` — порядок фильтров, как запрос проходит через цепочку; `UsernamePasswordAuthenticationFilter` — как обрабатывает форму/JSON; `BearerTokenAuthenticationFilter` — JWT flow |
| ☀️ 14:00–16:30 | **AuthenticationManager** | `AuthenticationManager` → `ProviderManager` → `AuthenticationProvider`; `SecurityContext` / `SecurityContextHolder` — ThreadLocal, стратегии хранения |
| 🌙 19:00–21:00 | **Method Security + CSRF** | `Method Security` — `@PreAuthorize`, `@PostAuthorize`, `@Secured`; `CSRF` — как работает токен, когда отключать |

---

### 📅 ДЕНЬ 20 — 15 сентября (вторник)
**Тема: Spring Security — OAuth2, OIDC, TLS**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **OAuth2 + OIDC** | `OAuth2` — Authorization Code Flow, PKCE; `OIDC` — ID Token, UserInfo endpoint |
| ☀️ 14:00–16:30 | **Authorization + Resource Server** | `Authorization Server` — Spring Authorization Server; `Resource Server` — валидация JWT, opaque tokens |
| 🌙 19:00–21:00 | **TLS + Certificates** | **TLS** — handshake, symmetric/asymmetric encryption, certificate chain; `Certificates` — X.509, CA, self-signed, Let's Encrypt, keystore/truststore |

---

## 🐘 БЛОК 7 — PostgreSQL (Дни 21–22)
> SQL Server internals знаешь — здесь детали PostgreSQL-специфики.

---

### 📅 ДЕНЬ 21 — 16 сентября (среда)
**Тема: PostgreSQL — MVCC, WAL, Isolation, Locks**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **MVCC + VACUUM** | `MVCC` — Multi-Version Concurrency Control, версии строк, xmin/xmax; `VACUUM` — обычный vs AUTOVACUUM vs VACUUM FULL, bloat |
| ☀️ 14:00–16:30 | **WAL + Isolation** | `WAL` — Write-Ahead Log, checkpoint, recovery; `Isolation levels` — READ COMMITTED (default), REPEATABLE READ, SERIALIZABLE; **SQL Advanced**: уровни изоляции — Dirty Read, Non-repeatable Read, Phantom Read |
| 🌙 19:00–21:00 | **Locks + Deadlocks** | `Locks` — row-level, table-level, advisory locks, deadlocks; `Deadlocks` — как обнаружить, `pg_locks`, `pg_stat_activity` |

---

### 📅 ДЕНЬ 22 — 17 сентября (четверг)
**Тема: PostgreSQL — Indexes + EXPLAIN + Advanced SQL**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Indexes + Transactions** | `Indexes` — B-Tree, Hash, GIN, GiST, Partial, Composite (leftmost prefix rule); `Transactions` — BEGIN/COMMIT/ROLLBACK, savepoints |
| ☀️ 14:00–16:30 | **EXPLAIN ANALYZE + Planner** | `EXPLAIN ANALYZE` — Seq Scan, Index Scan, Hash Join, Nested Loop, cost; `Planner` — statistics, `ANALYZE`, `pg_statistic` |
| 🌙 19:00–21:00 | **Advanced SQL** | **SQL Advanced**: Window Functions, CTE, lateral joins |

---

## 📨 БЛОК 8 — Messaging (Дни 23–24)
> Концепции знаешь из других стеков. Здесь Java-специфика и детали.

---

### 📅 ДЕНЬ 23 — 18 сентября (пятница)
**Тема: Kafka + Event Patterns**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Kafka архитектура** | Kafka: broker, topic, partition, offset, consumer group; **Producer** — batching, acks (0/1/all), idempotent producer, retries; **Idempotency** — idempotency key, at-least-once vs exactly-once |
| ☀️ 14:00–16:30 | **Kafka Consumer** | **Consumer** — poll loop, commit strategies (auto vs manual), rebalancing |
| 🌙 19:00–21:00 | **Event Patterns** | `Outbox Pattern` — атомарность запись в БД + публикация события; `Saga Pattern` — choreography vs orchestration; `CQRS` — разделение read/write модели, projections; `Event Sourcing` — хранение событий, воспроизведение состояния |

---

### 📅 ДЕНЬ 24 — 19 сентября (суббота)
**Тема: RabbitMQ + Distributed Systems**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **RabbitMQ** | Exchange types: direct, topic, fanout, headers; Queue, binding, routing key; **Dead Letter Queue (DLQ)** — что делать с failed messages; Acknowledgment modes — auto, manual, reject/requeue; RabbitMQ vs Kafka — когда что выбрать |
| ☀️ 14:00–16:30 | **CAP + Consistency** | `CAP theorem` — Consistency, Availability, Partition Tolerance, примеры баз (MongoDB, Cassandra, PostgreSQL); `BASE` — Basically Available, Soft state, Eventual consistency; `Consistency models` — strong, eventual, causal |
| 🌙 19:00–21:00 | **Replication + Consensus** | `Replication` — синхронная vs асинхронная, leader/follower; `Partitioning` — horizontal sharding, consistent hashing; `Leader Election` — зачем нужен, кто решает; `Consensus` — Raft алгоритм — leader election, log replication |

---

## ⚡ БЛОК 9 — Distributed Patterns + Redis (Дни 25–26)

---

### 📅 ДЕНЬ 25 — 20 сентября (воскресенье)
**Тема: Distributed Patterns**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Resilience** | `Distributed Locks` — Redis (Redisson), ZooKeeper, проблемы; `Retry` — exponential backoff, jitter; `Circuit Breaker` — Resilience4j: CLOSED → OPEN → HALF_OPEN |
| ☀️ 14:00–16:30 | **Backpressure + Bulkhead** | `Backpressure` — как producer не перегружает consumer; **Bulkhead** — изоляция ресурсов между сервисами, thread pool isolation, semaphore isolation (Resilience4j); `Rate Limiter` — bucket4j, Redis, алгоритмы (token bucket, leaky bucket) |
| 🌙 19:00–21:00 | **EDA + Strangler** | `Event Driven Architecture` — loose coupling, eventual consistency, паттерны публикации событий; `Event Driven` — choreography vs orchestration; **Strangler Fig** — паттерн постепенной миграции монолита на микросервисы |

---

### 📅 ДЕНЬ 26 — 21 сентября (понедельник)
**Тема: Redis**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Redis Patterns** | **Redis** — паттерны: Cache-Aside, Write-Through, Write-Behind, Read-Through; Session storage (Spring Session) |
| ☀️ 14:00–16:30 | **Redis Advanced** | Rate limiting; Pub/Sub; Distributed lock (Redisson); Sorted Sets / leaderboards |
| 🌙 19:00–21:00 | **Повторение блока 8–9** | Kafka + RabbitMQ + Distributed + Redis — устно объяснить ключевые концепции |

---

## 🏛 БЛОК 10 — Architecture + Patterns (Дни 27–28)
> Знаешь как сеньор — быстрый прогон с Java/Spring примерами.

---

### 📅 ДЕНЬ 27 — 22 сентября (вторник)
**Тема: Architecture**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Clean + Hexagonal + Onion** | `Clean Architecture` — dependency rule, use cases, entities; `Hexagonal Architecture` — ports & adapters, inversion of control; `Onion Architecture` — слои, dependency direction |
| ☀️ 14:00–16:30 | **Microservices + Modular** | `Layered Architecture` — presentation → business → persistence, когда достаточно; `Microservices` — decomposition strategies, communication (sync/async); `Modular Monolith` — vs Microservices, когда предпочтительнее; `Vertical Slice` — организация по фичам, не слоям |
| 🌙 19:00–21:00 | **GoF Creational + Structural** | **GoF Creational**: Factory Method, Abstract Factory, Builder, Prototype, Singleton; **GoF Structural**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy |

---

### 📅 ДЕНЬ 28 — 23 сентября (среда)
**Тема: GoF Behavioral + Enterprise Patterns**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **GoF Behavioral** | **GoF Behavioral**: Strategy, Observer, Command, State, Template Method, Chain of Responsibility, Mediator, Iterator, Visitor, Memento, Interpreter |
| ☀️ 14:00–16:30 | **Enterprise Patterns** | **Enterprise Patterns**: Repository, Specification, Decorator, Observer, Facade — с Java/Spring примерами |
| 🌙 19:00–21:00 | **Повторение** | Устно объяснить 5 любых паттернов с примерами из Spring |

---

## 🚀 БЛОК 11 — DevOps + Infrastructure (День 29)

---

### 📅 ДЕНЬ 29 — 24 сентября (четверг)
**Тема: DevOps + Infrastructure**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Docker + K8s + Helm** | **Docker** — multi-stage build, layered jar, docker-compose, healthcheck; `Kubernetes` — Pod, Deployment, Service, Ingress, ConfigMap, Secret; `Helm` — chart structure, values.yaml, templates |
| ☀️ 14:00–16:30 | **CI/CD + Deployment** | `Jenkins` — pipeline as code, Jenkinsfile; `CI/CD` — stages: build → test → package → deploy; `Blue Green` — переключение трафика, rollback; `Canary` — постепенный rollout, % трафика; `Rolling Update` — постепенная замена подов; `Nginx` — reverse proxy, upstream, load balancing, SSL termination; `Traefik` — dynamic configuration, Let's Encrypt |
| 🌙 19:00–21:00 | **Linux + API Gateway** | `Linux` — процессы, signals, `/proc`, `systemd`, journalctl; `Systemd` — unit files, systemctl, service lifecycle, targets; **API Gateway / Service Mesh** — Spring Cloud Gateway, Istio, Envoy |

---

## 🧪 БЛОК 12 — Testing + Production (Дни 30–31)

---

### 📅 ДЕНЬ 30 — 25 сентября (пятница)
**Тема: Testing**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Unit Tests** | `JUnit 5` — @ParameterizedTest, @ExtendWith, @Nested; `Mockito` — @Mock, @InjectMocks, verify, ArgumentCaptor; `AssertJ` — fluent assertions |
| ☀️ 14:00–16:30 | **Integration Tests** | `MockMvc` — тестирование Spring MVC без запуска сервера; `WireMock` — mock внешних HTTP сервисов; `Testcontainers` — реальная PostgreSQL/Kafka в тестах; `Integration Tests` — @SpringBootTest, test slices (@WebMvcTest, @DataJpaTest) |
| 🌙 19:00–21:00 | **Advanced Testing** | `Contract Tests` — Spring Cloud Contract, Pact; `Performance Tests` — Gatling, k6, JMeter |

---

### 📅 ДЕНЬ 31 — 26 сентября (суббота)
**Тема: Production Practices**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Monitoring + Observability** | `Micrometer` + `Prometheus` + `Grafana` — метрики в production; **Observability** — structured logging, OpenTelemetry, tracing, Correlation-ID; `Tracing` — micrometer-tracing, Zipkin/Jaeger; `Correlation ID` — MDC, propagation через HTTP headers |
| ☀️ 14:00–16:30 | **Logging + Health + Shutdown** | `Distributed Logs` — ELK stack (Elasticsearch + Logstash + Kibana); `Health Checks` — liveness vs readiness probe (Kubernetes); `Monitoring` — Spring Actuator endpoints, health indicators; `Graceful Shutdown` — `server.shutdown=graceful`, `spring.lifecycle.timeout-per-shutdown-phase` |
| 🌙 19:00–21:00 | **Production Patterns** | `Feature Flags` — LaunchDarkly, Togglz, strangler pattern; `Audit` — @CreatedBy, @LastModifiedBy, Spring Data Auditing; `Soft Delete` — @SQLDelete, @Where, @Filter; `Versioning` — API версионирование, entity versioning |

---

## 🔬 БЛОК 13 — Performance Profiling (День 32)

---

### 📅 ДЕНЬ 32 — 27 сентября (воскресенье)
**Тема: Performance + JVM Profiling**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Profiling Tools** | `JFR` (Java Flight Recorder) — включение, события, анализ; `VisualVM` — heap dump, thread dump, CPU profiling; `YourKit` / `JProfiler` — профессиональные профайлеры; `Flame Graphs` — как читать, CPU hotspots |
| ☀️ 14:00–16:30 | **Heap + Thread Dumps** | `Heap Dump` — анализ в Eclipse MAT, dominator tree; `Thread Dump` — jstack, как найти deadlock и long-running threads; `GC Logs` — `-Xlog:gc*`, читать паузы, thrashing |
| 🌙 19:00–21:00 | **Memory + CPU Profiling** | `CPU Profiling` — sampling vs instrumentation, hotspots, perf; `Memory Profiling` — allocation profiling, retained heap, memory leaks |

---

## 📖 БЛОК 14 — Spring Source Code + Практика (Дни 33–35)
> Самый сложный блок. Читаем исходники, пишем руками.

---

### 📅 ДЕНЬ 33 — 28 сентября (понедельник)
**Тема: Spring Source Code — Core**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **BeanFactory Sources** | `BeanFactory` → `DefaultListableBeanFactory` — `getBean()`, `doGetBean()`; `AbstractApplicationContext` → `refresh()` — 12 шагов; `AbstractAutowireCapableBeanFactory` → `doCreateBean()`, `populateBean()` |
| ☀️ 14:00–16:30 | **AutoConfig + Config Sources** | `ConditionEvaluator` → `shouldSkip()` — logic для AutoConfiguration; `ConfigurationClassParser` → как разбирает @Import, @Bean, @ComponentScan; `AnnotationConfigApplicationContext` — как читает @Configuration; `SpringApplication.run()` — от main() до первого HTTP запроса |
| 🌙 19:00–21:00 | **AOP + Proxy Sources** | `CglibAopProxy` — как создаётся прокси; `ProxyFactory` → `getProxy()` — JDK dynamic proxy vs CGLIB; `TransactionInterceptor` → `invoke()` → как открывается транзакция |

---

### 📅 ДЕНЬ 34 — 29 сентября (вторник)
**Тема: Spring MVC Sources + Hibernate Sources + Практика**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **MVC Sources** | `DispatcherServlet` → `doDispatch()` → handler selection → execution; `RequestMappingHandlerAdapter` → `invokeHandlerMethod()`; `DataBinder` → как Spring биндит параметры запроса |
| ☀️ 14:00–16:30 | **Hibernate + OpenJDK Sources** | Прочитать Hibernate `SessionImpl.save()` / `merge()` flow; понять как работает dirty checking (EntityEntry + snapshot); OpenJDK исходники — `HashMap`, `ArrayList`, `ThreadPoolExecutor`, `ForkJoinPool` |
| 🌙 19:00–21:00 | **Практика — Custom Components** | Написать собственный `@Enable...` с `ImportSelector`; написать собственный `Condition` (`@ConditionalOn...`); написать собственный `Spring Boot AutoConfiguration` с нуля (META-INF/spring/…) |

---

### 📅 ДЕНЬ 35 — 30 сентября (среда)
**Тема: Практика + Mock Interview + Финал**

| Время | Блок | Темы |
|-------|------|------|
| 🌅 10:00–12:30 | **Практика — Starter + IoC + WebFlux** | Написать простой Spring Boot Starter (autoconfigure + starter модули); набросок простой IoC/DI библиотеки (BeanDefinition → create → inject); **Reactive / WebFlux** — Project Reactor: `Mono<T>` (0..1), `Flux<T>` (0..N), backpressure, R2DBC, WebSocket, SSE |
| ☀️ 14:00–16:30 | **Mock Interview — Теория** | Ответить устно без подсказок на все вопросы из SENIOR_EXTENDED §13: ClassLoader + delegation model; JMM + happens-before — объяснить на примере; G1 GC — mixed GC, evacuation failure; HashMap internals — treeify порог, resize алгоритм; Spring AutoConfiguration механизм — полный путь; BeanPostProcessor — 3 примера из Spring (AutowiredAnnotationBeanPostProcessor и др.); Hibernate dirty checking; CAP theorem — пример с MongoDB, Cassandra, PostgreSQL; Rate limiter design — token bucket алгоритм; Distributed lock — Redisson, fencing token; MVCC в PostgreSQL — xmin/xmax; DispatcherServlet pipeline — все шаги |
| 🌙 19:00–21:00 | **Mock Interview — Практика** | Реализовать реентерабельный distributed lock; спроектировать систему с eventual consistency; объяснить по EXPLAIN ANALYZE медленный запрос; подготовить production incident story (реальный или придуманный детально) |

---

## 📊 Сводная таблица блоков

| # | Блок | Дни | Период |
|---|------|-----|--------|
| 1 | JVM Internals | 5 | 27.08 – 31.08 |
| 2 | Java Core | 2 | 01.09 – 02.09 |
| 3 | Spring Core Internals | 5 | 03.09 – 07.09 |
| 4 | Spring MVC Internals | 2 | 08.09 – 09.09 |
| 5 | Spring Data + Hibernate / JPA + Maven | 4 | 10.09 – 13.09 |
| 6 | Spring Security | 2 | 14.09 – 15.09 |
| 7 | PostgreSQL | 2 | 16.09 – 17.09 |
| 8 | Messaging (Kafka + RabbitMQ) | 2 | 18.09 – 19.09 |
| 9 | Distributed Patterns + Redis | 2 | 20.09 – 21.09 |
| 10 | Architecture + Patterns | 2 | 22.09 – 23.09 |
| 11 | DevOps + Infrastructure | 1 | 24.09 |
| 12 | Testing + Production | 2 | 25.09 – 26.09 |
| 13 | Performance Profiling | 1 | 27.09 |
| 14 | Spring Source Code + Практика + Mock Interview | 3 | 28.09 – 30.09 |

**Итого: 35 дней | ~245 часов**
