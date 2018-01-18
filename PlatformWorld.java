import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformWorld extends World
{

    /**
     * Constructor for objects of class PlatformWorld.
     * 
     */
    public PlatformWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Clouds clouds = new Clouds();
        addObject(clouds, 800, 96);
        Clouds clouds2 = new Clouds();
        addObject(clouds2, 2400, 96);

        midGround midground = new midGround();
        addObject(midground, 636, 266);
        foreGround foreground = new foreGround();
        addObject(foreground, 403, 576);

        Platform platform = new Platform();
        addObject(platform, 67, 458);
        Platform platform2 = new Platform();
        addObject(platform2, 149, 465);
        Platform platform3 = new Platform();
        addObject(platform3, 226, 463);
        Platform platform4 = new Platform();
        addObject(platform4, 312, 432);
        Platform platform5 = new Platform();
        addObject(platform5, 388, 404);
        Platform platform6 = new Platform();
        addObject(platform6, 462, 369);
        Platform platform7 = new Platform();
        addObject(platform7, 536, 336);
        Platform platform8 = new Platform();
        addObject(platform8, 610, 307);
        Platform platform9 = new Platform();
        addObject(platform9, 522, 268);
        Platform platform10 = new Platform();
        addObject(platform10, 399, 242);
        Platform platform11 = new Platform();
        addObject(platform11, 306, 225);
        Platform platform12 = new Platform();
        addObject(platform12, 221, 214);
        Platform platform13 = new Platform();
        addObject(platform13, 684, 392);
        Platform platform14 = new Platform();
        addObject(platform14, 763, 471);
        platform.setLocation(51, 467);
        platform2.setLocation(135, 467);
        platform3.setLocation(216, 465);
        platform4.setLocation(309, 435);
        platform5.setLocation(393, 403);
        platform6.setLocation(462, 363);
        platform7.setLocation(541, 328);
        platform8.setLocation(622, 291);
        platform9.setLocation(520, 253);
        platform10.setLocation(415, 222);
        platform11.setLocation(309, 197);
        platform12.setLocation(215, 168);
        platform13.setLocation(694, 372);
        platform14.setLocation(763, 470);
        Platform platform15 = new Platform();
        addObject(platform15, 107, 475);
        Platform platform16 = new Platform();
        addObject(platform16, 185, 475);
        platform15.setLocation(94, 468);
        platform16.setLocation(183, 468);
        removeObject(platform16);
        removeObject(platform3);
        removeObject(platform15);
        removeObject(platform);
        platform2.setLocation(41, 472);
        Platform platform17 = new Platform();
        addObject(platform17, 152, 479);
        Platform platform18 = new Platform();
        addObject(platform18, 262, 482);
        platform17.setLocation(145, 473);
        platform18.setLocation(243, 473);
        platform17.setLocation(141, 473);
        WinFlag winflag = new WinFlag();
        addObject(winflag, 796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        Hero hero = new Hero();
        addObject(hero, 46, 349);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(796, 428);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 455);
        winflag.setLocation(797, 449);
        Coin coin = new Coin();
        addObject(coin, 152, 442);
        Coin coin2 = new Coin();
        addObject(coin2, 254, 444);
        Coin coin3 = new Coin();
        addObject(coin3, 322, 410);
        Coin coin4 = new Coin();
        addObject(coin4, 403, 380);
        Coin coin5 = new Coin();
        addObject(coin5, 474, 342);
        Coin coin6 = new Coin();
        addObject(coin6, 554, 302);
        Coin coin7 = new Coin();
        addObject(coin7, 633, 265);
        Coin coin8 = new Coin();
        addObject(coin8, 532, 226);
        Coin coin9 = new Coin();
        addObject(coin9, 422, 196);
        Coin coin10 = new Coin();
        addObject(coin10, 322, 174);
        Coin coin11 = new Coin();
        addObject(coin11, 227, 144);
        Coin coin12 = new Coin();
        addObject(coin12, 707, 345);
        coin11.setLocation(220, 139);
        coin10.setLocation(318, 171);
        coin9.setLocation(421, 192);
        coin8.setLocation(526, 224);
        coin7.setLocation(630, 261);
        coin12.setLocation(704, 344);
        coin12.setLocation(700, 344);
        coin6.setLocation(550, 300);
        coin5.setLocation(469, 335);
        coin4.setLocation(399, 373);
        coin3.setLocation(317, 406);
        coin2.setLocation(249, 444);
        coin.setLocation(147, 444);
        coin11.setLocation(198, 128);
        platform12.setLocation(80, 131);
        coin11.setLocation(84, 98);
        coin11.setLocation(80, 97);
        coin10.setLocation(247, 121);
        platform11.setLocation(223, 174);
        coin10.setLocation(230, 122);
        platform11.setLocation(219, 163);
        coin10.setLocation(223, 120);
        coin9.setLocation(355, 150);
        platform10.setLocation(355, 203);
        coin9.setLocation(359, 144);
        platform10.setLocation(354, 199);
        coin8.setLocation(508, 177);
        platform9.setLocation(492, 225);
        coin8.setLocation(503, 165);
        platform9.setLocation(484, 220);
        coin8.setLocation(486, 161);
        coin12.setLocation(712, 332);
        platform13.setLocation(712, 370);
        coin12.setLocation(720, 326);
        platform14.setLocation(775, 469);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        platform13.setLocation(709, 219);
        coin12.setLocation(721, 190);
        coin7.setLocation(614, 244);
        platform8.setLocation(601, 277);
        coin7.setLocation(603, 241);
        coin12.setLocation(702, 102);
        platform13.setLocation(662, 170);
        platform14.setLocation(752, 172);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(797, 449);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(785, 117);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        winflag.setLocation(789, 149);
        coin12.setLocation(657, 140);
        platform12.setLocation(104, 133);
        platform9.setLocation(478, 214);
        platform10.setLocation(354, 191);
        platform11.setLocation(219, 159);
        platform12.setLocation(104, 123);
        coin11.setLocation(107, 84);
    }
}
