class Settings:
    # A class to store all settings for Alien Invation.

    def __init__(self):
        # Initialize the game settings.
        self.screen_width = 1200
        self.screen_height = 800
        self.bg_color = (255, 255, 255)

        # Ship settings
        self.ship_speed = 1.5
        self.ship_size = (60, 60)

        # Bullet settings
        self.bullet_speed = 1.0
        self.bullet_width = 3
        self.bullet_height = 15
        self.bullet_color = (0, 0, 0)
        self.bullet_allowed = 3
