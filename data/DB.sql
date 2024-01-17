create table barrio
(
    bar_id   integer not null
        constraint barrio_pk
            primary key autoincrement,
    bar_desc TEXT    not null
);

create unique index barrio_bar_desc_uindex
    on barrio (bar_desc);

create table ciudad
(
    ciu_id   integer not null
        constraint ciudad_pk
            primary key autoincrement,
    ciu_desc TEXT    not null
);

create unique index ciudad_ciu_desc_uindex
    on ciudad (ciu_desc);

create table cliente
(
    cli_id   integer not null
        constraint cliente_pk
            primary key autoincrement,
    cli_nom  TEXT    not null,
    cli_ape  TEXT    not null,
    cli_ci   TEXT    not null,
    cli_tel  integer,
    cli_dire TEXT    not null,
    bar_id   integer not null
        constraint cliente_barrio_bar_id_fk
            references barrio,
    ciu_id   integer not null
        constraint cliente_ciudad_ciu_id_fk
            references ciudad
);

create unique index cliente_cli_ci_uindex
    on cliente (cli_ci);

create table editorial
(
    edi_id  integer not null
        constraint editorial_pk
            primary key autoincrement,
    edi_nom TEXT    not null
);

create unique index editorial_edi_nom_uindex
    on editorial (edi_nom);

create table empleado
(
    emp_id   integer not null
        constraint empleado_pk
            primary key,
    emp_nom  TEXT    not null,
    emp_ape  TEXT    not null,
    emp_ci   TEXT    not null,
    emp_cel  integer,
    emp_dire TEXT    not null,
    bar_id   integer not null
        constraint empleado_barrio_bar_id_fk
            references barrio,
    ciu_id   integer not null
        constraint empleado_ciudad_ciu_id_fk
            references ciudad
);

create unique index empleado_emp_ci_uindex
    on empleado (emp_ci);

create table genero
(
    gen_id   integer not null
        constraint genero_pk
            primary key autoincrement,
    gen_desc TEXT    not null
);

create unique index genero_gen_desc_uindex
    on genero (gen_desc);

create table pais
(
    pai_id   integer not null
        constraint pais_pk
            primary key autoincrement,
    pai_desc TEXT    not null
);

create table autor
(
    aut_id  integer not null
        constraint autor_pk
            primary key autoincrement,
    aut_nom TEXT    not null,
    aut_ape TEXT    not null,
    pai_id  integer not null
        constraint autor_pais_pai_id_fk
            references pais
);

create unique index autor_compuesta_nombre
    on autor (aut_nom, aut_ape);

create table libro
(
    lib_id   integer not null
        constraint libro_pk
            primary key autoincrement,
    lib_nom  TEXT    not null,
    edi_id   integer not null
        constraint libro_editorial_edi_id_fk
            references editorial,
    aut_id   integer not null
        constraint libro_autor_aut_id_fk
            references autor,
    gen_id   integer not null
        constraint libro_genero_gen_id_fk
            references genero,
    lib_isbn integer
);

create table estado
(
    est_id    integer not null
        constraint estado_pk
            primary key autoincrement,
    est_fecha TEXT    not null,
    lib_id    integer not null
        constraint estado_libro_lib_id_fk
            references libro,
    emp_id    integer not null
        constraint estado_empleado_emp_id_fk
            references empleado,
    lib_est   TEXT    not null,
    cli_id    integer not null
        constraint estado_cliente_cli_id_fk
            references cliente
);

create unique index lib_isbn_uindex
    on libro (lib_isbn);

create unique index pais_pai_desc_uindex
    on pais (pai_desc);


