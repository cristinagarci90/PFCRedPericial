--------------------------------------------------------
-- Archivo creado  - lunes-febrero-03-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CLIENTE
--------------------------------------------------------

  CREATE TABLE "MAESTROS"."CLIENTE" 
   (	"IDCLIENTE" NUMBER, 
	"IDPOBLACION" VARCHAR2(4), 
	"IDSERIE" NUMBER, 
	"NOMBRE" VARCHAR2(150), 
	"SOLICITANTE" VARCHAR2(1) DEFAULT 'N', 
	"PAGADOR" VARCHAR2(1) DEFAULT 'N', 
	"CABECERAFAC" VARCHAR2(1) DEFAULT 'N', 
	"CABECERAINF" VARCHAR2(1) DEFAULT 'N', 
	"CIF" VARCHAR2(9), 
	"DIRECCION" VARCHAR2(150), 
	"CODIGO_POSTAL" NUMBER, 
	"WEB" VARCHAR2(100), 
	"EMAIL" VARCHAR2(20), 
	"TELEFONO1" VARCHAR2(50), 
	"TELEFONO2" VARCHAR2(50), 
	"FAX" VARCHAR2(20), 
	"PERSONA_CONTACTO" VARCHAR2(50), 
	"COMENTARIO" VARCHAR2(150), 
	"BAJA" VARCHAR2(1) DEFAULT 'N', 
	"IRPF" NUMBER, 
	"IVA" NUMBER, 
	"FECHA_ALTA" DATE, 
	"CUENTA_CONTABLE" VARCHAR2(30), 
	"IDPROVINCIA" VARCHAR2(2), 
	"DIAS_PRIMER_AVANCE" NUMBER, 
	"PERIODICIDAD_AVANCES" VARCHAR2(20)
   ) ;
 

   COMMENT ON TABLE "MAESTROS"."CLIENTE"  IS 'TABLA DE CLIENTES. EN ELLA ESTAN ASOCIADAS EL NOMBRE DEL CLIENTE, EL TIPO DE FACTURACION (ESTE TIPO VIENE DE LA TABLA DE TEXTOS COMUNES SUBTXT DONDE SE VA A ALMACENAR EL SUBCODIGO DE LA TABLA, PARA EL TIPO DE FACTURACION EL CODIGO DE TEXTOS COMUNES QUE LE CORRESPONDE ES EL 1). FK: TIENE ASOCIADO EL ID DE LA POBLACION A LA QUE PERTENECE Y LA SERIE DE FACTURACION';
--------------------------------------------------------
--  DDL for Table CONTADOR
--------------------------------------------------------

  CREATE TABLE "MAESTROS"."CONTADOR" 
   (	"IDSERIE" NUMBER, 
	"IDEJERCICIO" NUMBER, 
	"CONTADOR" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table EJERCICIO
--------------------------------------------------------

  CREATE TABLE "MAESTROS"."EJERCICIO" 
   (	"IDEJERCICIO" NUMBER, 
	"EJERCICIO" NUMBER, 
	"ACTIVO" VARCHAR2(1) DEFAULT 'N'
   ) ;
 

   COMMENT ON COLUMN "MAESTROS"."EJERCICIO"."IDEJERCICIO" IS 'PK DEL EJERCICIO';
 
   COMMENT ON COLUMN "MAESTROS"."EJERCICIO"."EJERCICIO" IS 'IDENTIFICA EL NUMERO DEL EJERCICIO POR EJEMPLO 2013';
 
   COMMENT ON COLUMN "MAESTROS"."EJERCICIO"."ACTIVO" IS 'VALOR POR DEFECTO SI LA SERIE ESTÁ ACTIVA';
--------------------------------------------------------
--  DDL for Table ESTADOS
--------------------------------------------------------

  CREATE TABLE "MAESTROS"."ESTADOS" 
   (	"IDESTADO" NUMBER(22,0), 
	"V" NUMBER DEFAULT 0, 
	"TIPO" VARCHAR2(1), 
	"CODIGO" VARCHAR2(20), 
	"DESCRIPCION" VARCHAR2(150), 
	"BAJA" VARCHAR2(1)
   ) ;
--------------------------------------------------------
--  DDL for Table PERITO
--------------------------------------------------------

  CREATE TABLE "MAESTROS"."PERITO" 
   (	"IDPERITO" NUMBER, 
	"PERITO" VARCHAR2(150), 
	"CODIGO_POSTAL" VARCHAR2(5), 
	"TELEFONO1" VARCHAR2(15), 
	"TELEFONO2" VARCHAR2(15), 
	"EMAIL" VARCHAR2(60), 
	"COMENTARIO" VARCHAR2(512), 
	"NIF" VARCHAR2(20), 
	"IRPF" NUMBER, 
	"IVA" NUMBER, 
	"RESULTANTE" NUMBER, 
	"FIJO" NUMBER, 
	"PRECIO_KM" NUMBER, 
	"COCHE_PROPIO" VARCHAR2(1), 
	"FOTOS" VARCHAR2(1), 
	"FECHA_ALTA" DATE, 
	"BAJA" VARCHAR2(1), 
	"IDPOBLACION" VARCHAR2(4), 
	"IDPROVINCIA" VARCHAR2(2)
   ) ;
--------------------------------------------------------
--  DDL for Table SERIES
--------------------------------------------------------

  CREATE TABLE "MAESTROS"."SERIES" 
   (	"IDSERIE" NUMBER, 
	"CODIGO" VARCHAR2(10), 
	"DESCRIPCION" VARCHAR2(60)
   ) ;
 

   COMMENT ON COLUMN "MAESTROS"."SERIES"."IDSERIE" IS 'PK DE LA SERIE';
 
   COMMENT ON COLUMN "MAESTROS"."SERIES"."CODIGO" IS 'POR EJEMPLO PTR';
 
   COMMENT ON COLUMN "MAESTROS"."SERIES"."DESCRIPCION" IS 'DESCRIPCION DE LA SERIE';

---------------------------------------------------
--   DATA FOR TABLE CONTADOR
--   FILTER = none used
---------------------------------------------------
REM INSERTING into MAESTROS.CONTADOR

---------------------------------------------------
--   END DATA FOR TABLE CONTADOR
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE SERIES
--   FILTER = none used
---------------------------------------------------
REM INSERTING into MAESTROS.SERIES
Insert into MAESTROS.SERIES (IDSERIE,CODIGO,DESCRIPCION) values (1,'1','1');

---------------------------------------------------
--   END DATA FOR TABLE SERIES
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE ESTADOS
--   FILTER = none used
---------------------------------------------------
REM INSERTING into MAESTROS.ESTADOS
Insert into MAESTROS.ESTADOS (IDESTADO,V,TIPO,CODIGO,DESCRIPCION,BAJA) values (1,0,'C','kjkjkj','kjkjkj','N');
Insert into MAESTROS.ESTADOS (IDESTADO,V,TIPO,CODIGO,DESCRIPCION,BAJA) values (2,0,'C','ffdfdfdfdfd','fdfdfdfd','N');

---------------------------------------------------
--   END DATA FOR TABLE ESTADOS
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE EJERCICIO
--   FILTER = none used
---------------------------------------------------
REM INSERTING into MAESTROS.EJERCICIO
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (1,2012,'N');
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (2,2013,'S');
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (3,2014,'N');
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (4,2015,'N');
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (5,2016,'N');
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (6,2017,'N');
Insert into MAESTROS.EJERCICIO (IDEJERCICIO,EJERCICIO,ACTIVO) values (7,2018,'N');

---------------------------------------------------
--   END DATA FOR TABLE EJERCICIO
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE CLIENTE
--   FILTER = none used
---------------------------------------------------
REM INSERTING into MAESTROS.CLIENTE
Insert into MAESTROS.CLIENTE (IDCLIENTE,IDPOBLACION,IDSERIE,NOMBRE,SOLICITANTE,PAGADOR,CABECERAFAC,CABECERAINF,CIF,DIRECCION,CODIGO_POSTAL,WEB,EMAIL,TELEFONO1,TELEFONO2,FAX,PERSONA_CONTACTO,COMENTARIO,BAJA,IRPF,IVA,FECHA_ALTA,CUENTA_CONTABLE,IDPROVINCIA,DIAS_PRIMER_AVANCE,PERIODICIDAD_AVANCES) values (1,'0052',null,'CLIENTE1','S','S','S','S','12345678','PLAZA AVENIDA',0,null,null,'9688787878',null,null,null,null,'N',0,0,null,null,'05',1,'7');

---------------------------------------------------
--   END DATA FOR TABLE CLIENTE
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE PERITO
--   FILTER = none used
---------------------------------------------------
REM INSERTING into MAESTROS.PERITO
Insert into MAESTROS.PERITO (IDPERITO,PERITO,CODIGO_POSTAL,TELEFONO1,TELEFONO2,EMAIL,COMENTARIO,NIF,IRPF,IVA,RESULTANTE,FIJO,PRECIO_KM,COCHE_PROPIO,FOTOS,FECHA_ALTA,BAJA,IDPOBLACION,IDPROVINCIA) values (4,'czzccxzzcxczx',null,null,null,null,null,'zcxcxzxczxczcxz',0,0,0,0,0,'S','S',null,'N','0015','03');
Insert into MAESTROS.PERITO (IDPERITO,PERITO,CODIGO_POSTAL,TELEFONO1,TELEFONO2,EMAIL,COMENTARIO,NIF,IRPF,IVA,RESULTANTE,FIJO,PRECIO_KM,COCHE_PROPIO,FOTOS,FECHA_ALTA,BAJA,IDPOBLACION,IDPROVINCIA) values (1,'PERITO1','30120','123455445443','12345464',null,null,'1515151',0,0,0,0,0,null,null,null,'N','0014','01');
Insert into MAESTROS.PERITO (IDPERITO,PERITO,CODIGO_POSTAL,TELEFONO1,TELEFONO2,EMAIL,COMENTARIO,NIF,IRPF,IVA,RESULTANTE,FIJO,PRECIO_KM,COCHE_PROPIO,FOTOS,FECHA_ALTA,BAJA,IDPOBLACION,IDPROVINCIA) values (2,'PERITO2','30120','123','123',null,null,null,null,null,null,null,null,null,null,null,null,'1',null);
Insert into MAESTROS.PERITO (IDPERITO,PERITO,CODIGO_POSTAL,TELEFONO1,TELEFONO2,EMAIL,COMENTARIO,NIF,IRPF,IVA,RESULTANTE,FIJO,PRECIO_KM,COCHE_PROPIO,FOTOS,FECHA_ALTA,BAJA,IDPOBLACION,IDPROVINCIA) values (3,'PERITO3','30120','123','123',null,null,'1515151',0,0,0,0,0,null,null,null,'N','0020','03');

---------------------------------------------------
--   END DATA FOR TABLE PERITO
---------------------------------------------------
--------------------------------------------------------
--  Constraints for Table CLIENTE
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."CLIENTE" MODIFY ("IDCLIENTE" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CLIENTE" MODIFY ("IDPOBLACION" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CLIENTE" MODIFY ("IDPROVINCIA" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CLIENTE" ADD PRIMARY KEY ("IDCLIENTE") ENABLE;
 
  ALTER TABLE "MAESTROS"."CLIENTE" MODIFY ("DIAS_PRIMER_AVANCE" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CLIENTE" MODIFY ("PERIODICIDAD_AVANCES" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CONTADOR
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."CONTADOR" MODIFY ("IDSERIE" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CONTADOR" MODIFY ("IDEJERCICIO" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CONTADOR" MODIFY ("CONTADOR" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."CONTADOR" ADD PRIMARY KEY ("IDSERIE", "IDEJERCICIO") ENABLE;
--------------------------------------------------------
--  Constraints for Table EJERCICIO
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."EJERCICIO" MODIFY ("IDEJERCICIO" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."EJERCICIO" ADD PRIMARY KEY ("IDEJERCICIO") ENABLE;
--------------------------------------------------------
--  Constraints for Table ESTADOS
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."ESTADOS" MODIFY ("IDESTADO" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."ESTADOS" ADD PRIMARY KEY ("IDESTADO") ENABLE;
--------------------------------------------------------
--  Constraints for Table PERITO
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."PERITO" MODIFY ("IDPERITO" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."PERITO" MODIFY ("IDPOBLACION" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."PERITO" ADD PRIMARY KEY ("IDPERITO") ENABLE;
--------------------------------------------------------
--  Constraints for Table SERIES
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."SERIES" MODIFY ("IDSERIE" NOT NULL ENABLE);
 
  ALTER TABLE "MAESTROS"."SERIES" ADD PRIMARY KEY ("IDSERIE") ENABLE;
--------------------------------------------------------
--  DDL for Index SYS_C004201
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAESTROS"."SYS_C004201" ON "MAESTROS"."CLIENTE" ("IDCLIENTE") 
  ;
--------------------------------------------------------
--  DDL for Index SYS_C004205
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAESTROS"."SYS_C004205" ON "MAESTROS"."CONTADOR" ("IDSERIE", "IDEJERCICIO") 
  ;
--------------------------------------------------------
--  DDL for Index SYS_C004207
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAESTROS"."SYS_C004207" ON "MAESTROS"."EJERCICIO" ("IDEJERCICIO") 
  ;
--------------------------------------------------------
--  DDL for Index SYS_C004488
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAESTROS"."SYS_C004488" ON "MAESTROS"."ESTADOS" ("IDESTADO") 
  ;
--------------------------------------------------------
--  DDL for Index SYS_C004210
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAESTROS"."SYS_C004210" ON "MAESTROS"."PERITO" ("IDPERITO") 
  ;
--------------------------------------------------------
--  DDL for Index SYS_C004212
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAESTROS"."SYS_C004212" ON "MAESTROS"."SERIES" ("IDSERIE") 
  ;

--------------------------------------------------------
--  Ref Constraints for Table CONTADOR
--------------------------------------------------------

  ALTER TABLE "MAESTROS"."CONTADOR" ADD FOREIGN KEY ("IDSERIE")
	  REFERENCES "MAESTROS"."SERIES" ("IDSERIE") ENABLE;
 
  ALTER TABLE "MAESTROS"."CONTADOR" ADD FOREIGN KEY ("IDEJERCICIO")
	  REFERENCES "MAESTROS"."EJERCICIO" ("IDEJERCICIO") ENABLE;




