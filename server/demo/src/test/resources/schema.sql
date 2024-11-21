CREATE TABLE "public"."todo" (
    "id" integer DEFAULT nextval('todo_id_seq') NOT NULL,
    "title" character(30) NOT NULL,
    "desc" character(300) NOT NULL,
    CONSTRAINT "todo_pkey" PRIMARY KEY ("id")
) WITH (oids = false);