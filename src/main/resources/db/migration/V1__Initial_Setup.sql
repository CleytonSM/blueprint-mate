CREATE TABLE tb_authority(
  id_auth int PRIMARY KEY AUTO_INCREMENT,
  nm_auth varchar(10),
  created_at timestamp,
  updated_at timestamp
);

CREATE TABLE tb_user(
  id_user int PRIMARY KEY AUTO_INCREMENT,
  id_auth int NOT NULL REFERENCES tb_authority(id_auth),
  email_user varchar(80),
  pwd_user varchar(80),
  active_user boolean,
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_client(
  id_client int PRIMARY KEY AUTO_INCREMENT,
  id_user int UNIQUE NOT NULL REFERENCES tb_user(id_user),
  nm_client varchar(60) NOT NULL,
  nicknm_client varchar(40),
  birthday_client date NOT NULL,
  marital_status_client varchar(12) NOT NULL,
  religion_client varchar(45),
  veg_vege_client bool,
  individual_needs_client varchar(150),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_social_media(
  id_social_media int PRIMARY KEY AUTO_INCREMENT,
  id_client int NOT NULL REFERENCES tb_client(id_client),
  nm_social_media varchar(60),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_descendants(
  id_descendant int PRIMARY KEY AUTO_INCREMENT,
  id_client int NOT NULL REFERENCES tb_client(id_client),
  nm_descendant varchar(60),
  age_descendant int,
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_form(
    id_form int PRIMARY KEY AUTO_INCREMENT,
    id_client int NOT NULL REFERENCES tb_client(id_client),
    title_form varchar(40)
    created_at timestamp,
    updated_at timestamp,
    deleted_at timestamp
);

CREATE TABLE tb_description(
  id_desc int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  best_place_desc varchar(180),
  wknd_best_place_desc varchar(180),
  miss_actual_house_desc varchar(180),
  bool_actual_house_satisfaction boolean,
  actual_house_satisfaction_desc varchar(180),
  job_desc varchar(30),
  work_routine_desc varchar(180),
  bool_work_at_home boolean,
  days_working_at_home int,
  bool_travels_for_work boolean,
  travels_for_work_desc varchar(45),
  bool_practice_sports boolean,
  practice_sports_desc varchar(100),
  bool_travel boolean,
  travel_desc varchar(50),
  bool_watch_tv boolean,
  watch_tv_desc varchar(200),
  bool_read boolean,
  bool_book_read boolean,
  bool_tablet_read boolean,
  bool_pets boolean,
  pets_desc varchar(180),
  bool_cook boolean,
  cook_desc varchar(180),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_experience(
  id_experience int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  neutral_color_exp varchar(20),
  lively_color_exp varchar(20),
  like_to_feel_exp varchar(180),
  house_meaning_exp varchar(180),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_context(
  id_context int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  project_life_stage_significance_context varchar(200),
  investment_expectation_context varchar(200),
  project_duration_expectation_context varchar(200),
  location_during_renovation_context varchar(200),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_style_and_moods(
  id_style_and_moods int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  ambient_style_style_and_moods varchar(20),
  ambient_style_description_style_and_moods varchar(180),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_general_info(
  id_general_info int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  reuse_general_info varchar(200),
  additional_general_info varchar(200),
  unlisted_furniture_or_equipment_general_info varchar(200),
  avoidance_requests_general_info varchar(200),
  plant_relationship_general_info varchar(50),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_suite(
  id_suite int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  bed_type_suite varchar(30)
);

CREATE TABLE tb_master_suite(
  id_master_suite INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_suite(id_suite),
  bool_tv_in_master_suite boolean,
  bool_armchair_master_suite boolean,
  bool_bench_master_suite boolean,
  bool_reads_in_bed_master_suite boolean,
  bool_nightstand_drawer_master_suite boolean,
  bool_wood_headboard_preference_master_suite boolean,
  bool_fabric_headboard_preference_master_suite boolean,
  bool_full_length_mirror_in_master_suite boolean,
  current_closet_length_master_suite decimal(5,2),
  current_clothes_rail_length_master_suite decimal(5,2),
  current_shoe_pairs_count_master_suite int,
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_descendants_suite(
  id_descendants_suite INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_suite(id_suite),
  bool_tv_in_descendants_suite boolean,
  bool_child_study_in_descendants_suite boolean,
  bool_child_receives_friends_to_sleep_descendants_suite boolean,
  theme_descendants_suite varchar(30),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_home_office_suite(
  id_home_office_suite INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_suite(id_suite),
  bool_needs_privacy boolean,
  bool_needs_space_for_books_documents_papers boolean,
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_guest_suite(
  id_guest_suite INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_suite(id_suite),
  closet_use_guests_suite varchar(45),
  frequency_of_guests_guests_suite varchar(45),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_building(
  id_building int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form),
  neighborhood_relationship_building varchar(180),
  determining_factor_building varchar(180),
  architectural_language_building varchar(180),
  balcony_integration_building varchar(180),
  building_manager_contact_building varchar(180),
  created_at timestamp,
  updated_at timestamp,
  deleted_at timestamp
);

CREATE TABLE tb_project(
  id_project int PRIMARY KEY AUTO_INCREMENT,
  id_form int NOT NULL REFERENCES tb_form(id_form)
);

CREATE TABLE tb_kitchen(
    id_kitchen INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    color_type_kitchen VARCHAR(30) NOT NULL,
    shape_type_kitchen VARCHAR(30) NOT NULL,
    counter_top_material_kitchen VARCHAR(30) NOT NULL,
    material_preference_kitchen VARCHAR(30) NOT NULL,
    bool_wet_gutter_or_built_in_trash_can_kitchen BOOLEAN,
    bool_stove_kitchen BOOLEAN,
    bool_cooktop_kitchen BOOLEAN,
    bool_induction_kitchen BOOLEAN,
    bool_burners_kitchen BOOLEAN,
    bool_stove_on_counter_top_kitchen BOOLEAN,
    bool_stove_on_tower_kitchen BOOLEAN,
    fridge_type_kitchen VARCHAR(60),
    bool_separate_freezer_kitchen BOOLEAN,
    fridge_capacity_liters_kitchen INTEGER,
    current_storage_satisfaction_kitchen VARCHAR(140),
    dinner_capacity_kitchen INTEGER,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_dining_room(
    id_dining_room INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    dining_table_capacity_dining_room INTEGER,
    daily_meals_location_dining_room VARCHAR(60),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_living_room(
    id_living_room INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    people_in_living_room INTEGER,
    bool_tv_is_important_living_room BOOLEAN,
    tv_inch_living_room INTEGER,
    equipment_living_room VARCHAR(160),
    bool_sofa_with_chaise_living_room BOOLEAN,
    bool_sofa_with_retractable_chaise_living_room BOOLEAN,
    bool_books_or_collection_living_room BOOLEAN,
    bool_used_daily_living_room BOOLEAN,
    receives_many_people_living_room varchar(100),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_entrance_hall(
    id_entrance_hall INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    bool_shoes_house_walking_entrance_hall BOOLEAN,
    bool_has_entrance_console_table_entrance_hall BOOLEAN,
    bool_want_entrance_console_table_entrance_hall BOOLEAN,
    bool_full_length_mirror_entrance_hall BOOLEAN,
    bool_familiar_with_electronic_locks_entrance_hall BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_toilet(
    id_toilet INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    apartment_pattern_toilet VARCHAR(180),
    design_toilet VARCHAR(50),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_laundry(
    id_laundry INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    bool_built_in_sink_laundry BOOLEAN,
    bool_porcelain_sink_laundry BOOLEAN,
    bool_pet_food_and_bowls_stored_here_laundry BOOLEAN,
    bool_recycles_trash_laundry BOOLEAN,
    current_drying_rack_count_laundry INTEGER,
    drying_rack_sizes_laundry DECIMAL(5,2),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_bathroom(
    id_bathroom INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_project(id_project),
    bool_all_renovated_bathroom BOOLEAN,
    preferred_sink_shape_bathroom VARCHAR(50),
    preferred_flush_type_bathroom VARCHAR(20),
    bool_hygienic_shower_bathroom BOOLEAN,
    bool_bidet_bathroom BOOLEAN,
    bool_prefers_mixer_tap_bathroom BOOLEAN,
    bool_prefers_single_handle_bathroom BOOLEAN,
    bool_electric_towel_rack_bathroom BOOLEAN,
    bool_laundry_hamper_in_cabinet_bathroom BOOLEAN,
    bool_makeup_in_bathroom_mirror_bathroom BOOLEAN,
    bool_many_products_on_counter_bathroom BOOLEAN,
    bool_daily_use_of_hairdryer_bathroom BOOLEAN,
    bool_shower_niche_for_products_bathroom BOOLEAN,
    bool_current_storage_meets_needs_bathroom BOOLEAN,
    bool_desire_more_storage_space_bathroom BOOLEAN,
    bool_sauna_in_shower_bathroom BOOLEAN,
    bool_bathtub_bathroom BOOLEAN,
    bool_immersion_bathroom BOOLEAN,
    bool_hydro_bathroom BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE tb_appliances(
  id_appliances int PRIMARY KEY AUTO_INCREMENT,
  id_kitchen int REFERENCES tb_kitchen(id_kitchen),
  id_laundry int REFERENCES tb_laundry(id_laundry),
  bool_store_small_appliances_visible boolean,
  bool_store_small_appliances_hidden boolean
);

CREATE TABLE tb_reuse_appliances(
  id_reuse_appliances INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_appliances(id_appliances),
  nm_reuse_appliances varchar(30),
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP
);

CREATE TABLE tb_new_appliances(
  id_new_appliances INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_appliances(id_appliances),
  link_new_appliances TEXT,
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP
);

CREATE TABLE tb_necessary_appliances(
  id_necessary_appliances INTEGER PRIMARY KEY AUTO_INCREMENT REFERENCES tb_appliances(id_appliances),
  nm_necessary_appliances varchar(45),
  bool_used_daily_necessary_appliances boolean,
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP
);

INSERT INTO tb_authority (nm_auth, created_at)
VALUES ('ROLE_USER', NOW());