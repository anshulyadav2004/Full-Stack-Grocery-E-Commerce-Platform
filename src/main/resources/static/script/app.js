// ============================================================
// HERO SLIDER
// ============================================================

document.addEventListener('DOMContentLoaded', () => {

    const slides = document.querySelectorAll(".hero-slide");
    const dots = document.querySelectorAll(".hero-dot");

    let currentSlide = 0;

    function showNextSlide() {

        // Current slide hide
        slides[currentSlide].classList.remove(
            "opacity-100",
            "translate-x-0"
        );

        slides[currentSlide].classList.add(
            "opacity-0",
            "translate-x-full"
        );

        // Next slide
        currentSlide++;

        // Agar last slide hai to first slide par wapas
        if (currentSlide >= slides.length) {
            currentSlide = 0;
        }

        // Next slide show
        slides[currentSlide].classList.remove(
            "opacity-0",
            "translate-x-full"
        );

        slides[currentSlide].classList.add(
            "opacity-100",
            "translate-x-0"
        );

        // Dots update
        dots.forEach((dot, index) => {

            if (index === currentSlide) {
                dot.classList.remove("bg-white/40");
                dot.classList.add("bg-white");
            } else {
                dot.classList.remove("bg-white");
                dot.classList.add("bg-white/40");
            }

        });
    }

    // Har 2 seconds mein next slide
    if (slides.length > 1) {
        setInterval(showNextSlide, 2000);
    }

});


// ============================================================
// CATEGORY NAVIGATION
// ============================================================

function goCategory(category) {
    function goCategory(category) {

        alert(category);

    }
}


// ============================================================
// AUTH LOGIN / REGISTER TAB
// ============================================================

function switchAuthTab(tab) {

    const login = document.getElementById('form-login');
    const register = document.getElementById('form-register');

    const loginTab = document.getElementById('auth-tab-login');
    const registerTab = document.getElementById('auth-tab-register');

    // Agar elements page par nahi hain to function stop
    if (!login || !register) return;


    // LOGIN
    if (tab === 'login') {

        login.classList.remove('hidden');
        register.classList.add('hidden');

        loginTab.className =
            'w-1/2 py-2.5 text-xs font-extrabold text-slate-800 border-b-2 border-kirana-700';

        registerTab.className =
            'w-1/2 py-2.5 text-xs font-bold text-slate-400 border-b-2 border-transparent';


        // REGISTER
    } else {

        login.classList.add('hidden');
        register.classList.remove('hidden');

        registerTab.className =
            'w-1/2 py-2.5 text-xs font-extrabold text-slate-800 border-b-2 border-saffron-600';

        loginTab.className =
            'w-1/2 py-2.5 text-xs font-bold text-slate-400 border-b-2 border-transparent';

    }
}


// ============================================================
// DEAL COUNTDOWN TIMER
// ============================================================

document.addEventListener('DOMContentLoaded', () => {

    const timer = document.getElementById('dealTimer');

    if (timer) {

        // 8 hours 42 minutes 15 seconds
        let seconds = 8 * 3600 + 42 * 60 + 15;

        setInterval(() => {

            if (seconds <= 0) return;

            seconds--;

            const h = String(
                Math.floor(seconds / 3600)
            ).padStart(2, '0');

            const m = String(
                Math.floor((seconds % 3600) / 60)
            ).padStart(2, '0');

            const s = String(
                seconds % 60
            ).padStart(2, '0');

            timer.textContent =
                `${h}h : ${m}m : ${s}s`;

        }, 1000);
    }

});