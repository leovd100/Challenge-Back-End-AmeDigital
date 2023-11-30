

CREATE TABLE IF NOT EXISTS public.tb_planet  (
    appearances integer,
    id bigint NOT NULL,
    climated character varying(255),
    name character varying(255),
    terrain character varying(255)
);



INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (NULL, 1, 'hot', 'valorant', 'arid');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (5, 3, 'arid', 'Tatooine', 'desert');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (2, 4, 'temperate', 'Alderaan', 'grasslands, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 5, 'temperate, tropical', 'Yavin IV', 'jungle, rainforests');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 6, 'frozen', 'Hoth', 'tundra, ice caves, mountain ranges');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (3, 7, 'murky', 'Dagobah', 'swamp, jungles');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 8, 'temperate', 'Bespin', 'gas giant');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 9, 'temperate', 'Endor', 'forests, mountains, lakes');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (4, 10, 'temperate', 'Naboo', 'grassy hills, swamps, forests, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (4, 11, 'temperate', 'Coruscant', 'cityscape, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 12, 'temperate', 'Kamino', 'ocean');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 13, 'temperate, arid', 'Geonosis', 'rock, desert, mountain, barren');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 14, 'temperate, arid, windy', 'Utapau', 'scrublands, savanna, canyons, sinkholes');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 15, 'hot', 'Mustafar', 'volcanoes, lava rivers, mountains, caves');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 16, 'tropical', 'Kashyyyk', 'jungle, forests, lakes, rivers');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 17, 'artificial temperate ', 'Polis Massa', 'airless asteroid');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 18, 'frigid', 'Mygeeto', 'glaciers, mountains, ice canyons');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 19, 'hot, humid', 'Felucia', 'fungus forests');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 20, 'temperate, moist', 'Cato Neimoidia', 'mountains, fields, forests, rock arches');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 21, 'hot', 'Saleucami', 'caves, desert, mountains, volcanoes');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 22, 'temperate', 'Stewjon', 'grass');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 23, 'polluted', 'Eriadu', 'cityscape');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 24, 'temperate', 'Corellia', 'plains, urban, hills, forests');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 25, 'hot', 'Rodia', 'jungles, oceans, urban, swamps');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 26, 'temperate', 'Nal Hutta', 'urban, oceans, swamps, bogs');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 27, 'temperate', 'Dantooine', 'oceans, savannas, mountains, grasslands');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 28, 'temperate', 'Bestine IV', 'rocky islands, oceans');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (1, 29, 'temperate', 'Ord Mantell', 'plains, seas, mesas');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 30, 'unknown', 'unknown', 'unknown');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 31, 'arid', 'Trandosha', 'mountains, seas, grasslands, deserts');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 32, 'arid', 'Socorro', 'deserts, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 33, 'temperate', 'Mon Cala', 'oceans, reefs, islands');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 34, 'temperate', 'Chandrila', 'plains, forests');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 35, 'superheated', 'Sullust', 'mountains, volcanoes, rocky deserts');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 36, 'temperate', 'Toydaria', 'swamps, lakes');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 37, 'arid, temperate, tropical', 'Malastare', 'swamps, deserts, jungles, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 38, 'temperate', 'Dathomir', 'forests, deserts, savannas');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 39, 'temperate, arid, subartic', 'Ryloth', 'mountains, valleys, deserts, tundra');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 40, 'unknown', 'Aleen Minor', 'unknown');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 41, 'temperate, artic', 'Vulpter', 'urban, barren');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 42, 'unknown', 'Troiken', 'desert, tundra, rainforests, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 43, 'unknown', 'Tund', 'barren, ash');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 44, 'temperate', 'Haruun Kal', 'toxic cloudsea, plateaus, volcanoes');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 45, 'temperate', 'Cerea', 'verdant');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 46, 'tropical, temperate', 'Glee Anselm', 'lakes, islands, swamps, seas');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 47, 'unknown', 'Iridonia', 'rocky canyons, acid pools');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 48, 'unknown', 'Tholoth', 'unknown');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 49, 'arid, rocky, windy', 'Iktotch', 'rocky');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 50, 'unknown', 'Quermia', 'unknown');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 51, 'temperate', 'Dorin', 'unknown');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 52, 'temperate', 'Champala', 'oceans, rainforests, plateaus');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 53, 'unknown', 'Mirial', 'deserts');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 54, 'unknown', 'Serenno', 'rainforests, rivers, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 55, 'unknown', 'Concord Dawn', 'jungles, forests, deserts');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 56, 'unknown', 'Zolan', 'unknown');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 57, 'frigid', 'Ojom', 'oceans, glaciers');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 58, 'temperate', 'Skako', 'urban, vines');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 59, 'temperate', 'Muunilinst', 'plains, forests, hills, mountains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 60, 'temperate', 'Shili', 'cities, savannahs, seas, plains');
INSERT INTO public.tb_planet (appearances, id, climated, name, terrain) VALUES (0, 61, 'arid, temperate, tropical', 'Kalee', 'rainforests, cliffs, canyons, seas');